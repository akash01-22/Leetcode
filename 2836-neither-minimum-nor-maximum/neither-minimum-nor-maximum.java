class Solution {
    public int findNonMinOrMax(int[] nums) {
       if(nums.length<3) return -1;
       int max=0;
       int min=0;
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        min=Math.min(min,nums[i]);
       }
       return nums[min+1];
       //return nums[1];
    }
}