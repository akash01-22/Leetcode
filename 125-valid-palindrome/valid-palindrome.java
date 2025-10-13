class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       int start=0;
       int end=s.length()-1;
        while(start<end){
        //for(int i=0;i<s.length()-1;i++){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}