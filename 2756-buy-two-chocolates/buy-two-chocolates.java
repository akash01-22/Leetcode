class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
             int cost=prices[i]+prices[j];
             if(cost<=money) return money-cost;
            }
        }
        return money;
    }
}