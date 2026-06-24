class Solution {
    public String winningPlayer(int x, int y) {
        int max=Math.min(x,y/4);
        if(max%2==1) return "Alice";
        else return "Bob";
    }
}