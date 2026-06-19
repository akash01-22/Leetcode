class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int n=batteryPercentages.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(batteryPercentages[i]>0){
                 count++;
                 int max=0;
                 for(int j=0;j<n;j++){
                     batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                 }
            }
            else continue;
        }
        return count;
    }
}