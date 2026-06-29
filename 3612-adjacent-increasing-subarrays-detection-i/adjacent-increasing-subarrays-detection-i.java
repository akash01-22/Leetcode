class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int current = 1;
        int total = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                current++;
            } else {
                total = current;
                current = 1;
            }
            if (current >= 2 * k || (current >= k && total >= k))
                return true;
        }
        return false;
    }
}