class Solution {
    public int finalValueAfterOperations(String[] operations) {
     int result=0;   
     int n=operations.length;
     for(int i=0;i<n;i++){
        if(operations[i].charAt(1)=='+') result++;
        else result--;
     }
     return result;
    }
}