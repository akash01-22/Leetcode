class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }
}