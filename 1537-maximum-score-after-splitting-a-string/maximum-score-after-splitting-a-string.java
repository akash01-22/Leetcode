class Solution {
    public int maxScore(String s) {
        int score=0;
        for(int i=1;i<s.length();i++){
            int leftsum=0,rightsum=0;
            for(int j=0;j<i;j++){
                if(s.charAt(j)=='0') leftsum++;
            }
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='1') rightsum++;
            }
            score=Math.max(score,leftsum+rightsum);
        }
        return score;
    }
}