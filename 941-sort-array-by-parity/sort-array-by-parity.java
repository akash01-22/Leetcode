class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        int k = 0;
        for (int num : even) {
            nums[k++] = num;
        }
        for (int num : odd) {
            nums[k++] = num;
        }
        return nums;
    }
}