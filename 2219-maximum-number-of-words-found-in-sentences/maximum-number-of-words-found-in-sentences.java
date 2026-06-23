class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String i:sentences){
            int sentence=i.split(" ").length;
            max=Math.max(max,sentence);
        }
        return max;
    }
}