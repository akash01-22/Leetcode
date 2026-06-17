class Solution {
    public int passThePillow(int n, int time) {
       int current=1;
       int direction=1;
       for(int i=1;i<=time;i++){
          if(current==n) direction=-1;
          else if(current==1) direction=1;
       current+=direction;
       }
       return current;
    }
}