class Solution {
    public int countDigits(int num) {
       int count=0;
       int temp=num;
       while(temp>0){
          int result=temp%10;
          if(num%result==0){
            count++;
          }
          temp/=10; 
       }
       return count;
    }
}