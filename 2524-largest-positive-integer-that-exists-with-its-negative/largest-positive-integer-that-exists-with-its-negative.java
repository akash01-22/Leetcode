class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == -nums[j])
                    return max = Math.max(max, Math.abs(nums[i]));
            }
        }
        return max;
    }
}