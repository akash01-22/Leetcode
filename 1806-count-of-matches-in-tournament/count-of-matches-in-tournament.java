class Solution {
    public int numberOfMatches(int n) {
        int sum = 0;
        while (n > 1) {
            int matches = n / 2;
            sum += matches;
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (n - 1) / 2 + 1;
        }
        return sum;
    }
}