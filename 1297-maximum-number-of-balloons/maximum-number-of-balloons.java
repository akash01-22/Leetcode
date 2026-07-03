class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[]=new int[26];
        for(char ch:text.toCharArray()){
            freq[ch-'a']++;
        }
        int b=freq['b'-'a'];
        int a=freq['a'-'a'];
        int l=freq['l'-'a']/2;
        int o=freq['o'-'a']/2;
        int n=freq['n'-'a'];
        int ans=Math.min(b,a);
        ans=Math.min(ans,l);
        ans=Math.min(ans,o);
        ans=Math.min(ans,n);
        return ans;
    }
}