class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumOfAlice=0;
        int sumOfBob=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sumOfAlice+=nums[i];
            }
            else if(nums[i]<100){
                sumOfBob+=nums[i];
            }
        }
        if(sumOfAlice==sumOfBob) return false;
        else return true;
    }
}