class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
      int count=0;
      int total=1;
      int[]arr=new int[spells.length];
      for(int i=0;i<spells.length;i++){
        int spell=spells[i];
        int left=0,right=potions.length-1,position=potions.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            long value=(long)spell*potions[mid];
            if(value>=success) 
            {
                position=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        
      arr[i]=potions.length-position;
      
      }
      return arr;
    }
}