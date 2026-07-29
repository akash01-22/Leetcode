class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int deck=n*n;
        int containers=maxWeight/w;
        return Math.min(deck,containers);
    }
}