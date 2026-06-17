class Solution {
    public boolean isSameAfterReversals(int num) {
      return(num==0 || num%10!=0);  
    }
}   
        
        /*
        int temp=num;
        int rev1=0;
        while(num!=0){
            int digit=num%10;
            rev1=digit+rev1*10;
            temp/=10;
        }
        temp=rev1;
        int rev2=0;
        while(num!=0){
            int digit=rev1%10;
            rev2=digit+rev2*10;
            temp/=10;
        }
        return num==rev2;
    }
}
*/