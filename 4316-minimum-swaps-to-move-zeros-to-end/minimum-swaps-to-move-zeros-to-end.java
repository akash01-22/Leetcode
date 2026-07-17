class Solution {
    public int minimumSwaps(int[] nums) {
        int count = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            while (start < end && nums[start] != 0) {
                start++;
            }
            while (start < end && nums[end] == 0) {
                end--;
            }
            if (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
                count++;
            }
        }
        return count;
    }
}