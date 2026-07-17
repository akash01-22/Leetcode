class Solution {
    public boolean consecutiveSetBits(int n) {
        String Binary=Integer.toBinaryString(n);
        int count=0;
        for(int i=1;i<Binary.length();i++){
            if(Binary.charAt(i)=='1' && Binary.charAt(i-1)=='1')count++; 
        }
        if(count==1) return true;
        else return false;
    }
}