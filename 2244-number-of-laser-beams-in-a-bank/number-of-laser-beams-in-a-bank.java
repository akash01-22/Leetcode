class Solution {
    public int numberOfBeams(String[] bank) {
        int total=0;
        int previous=0;
        for(String s:bank){
            int current=0;
            for(char ch:s.toCharArray()){
                if(ch=='1') current++;
            }
        if(current>0){
            total+=previous*current;
            previous=current;
        }
        }
        return total;
    }
}