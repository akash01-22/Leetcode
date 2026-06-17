class Solution {
    public String trimTrailingVowels(String s) {
        int temp=s.length()-1;
        while(temp>=0 && isVowel(s.charAt(temp))){
           temp--;
        }
        return s.substring(0,temp+1);
    }
    boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}