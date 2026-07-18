class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return gcd(max, min);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}