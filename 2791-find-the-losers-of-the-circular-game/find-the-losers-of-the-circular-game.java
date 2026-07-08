class Solution {
    public int[] circularGameLosers(int n, int k) {
        int vis[] = new int[n];
        int curr = 0;
        int turn = 1;
        vis[curr] = 1;

        while (true) {
            curr = curr + (turn * k);
            curr = curr % n;
            if (vis[curr] == 1)
                break;
            vis[curr] = 1;
            turn++;
        }

        int size = n - turn;
        int idx = 0;
        int ans[] = new int[size];
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0)
                ans[idx++] = i + 1;
        }
        return ans;
    }
}
