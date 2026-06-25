class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        for (int i = 0; i < n - 1; i++) {
            Arrays.sort(stones);
            int max1 = stones[n - 1];
            int max2 = stones[n - 2];
            stones[n - 1] = max1 - max2;
            stones[n - 2] = 0;
        }
        return stones[n - 1];
    }
}