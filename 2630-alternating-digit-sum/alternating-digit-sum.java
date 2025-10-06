class Solution {
    public int alternateDigitSum(int n) {
        int sum=0,count=0,temp=n;
        while(temp!=0){
           count++;
           temp/=10;
        }
        while(n!=0){
            if(count%2==0){
                sum-=n%10;
            }
            else{
                sum+=n%10;
            }
            count--;
           n/=10;
        }
            return sum;
    }
}