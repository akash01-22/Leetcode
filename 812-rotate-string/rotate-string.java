class Solution {
    public boolean rotateString(String s, String goal) {
      String str=s+s;
      if(str.contains(goal) && goal.length()==s.length()) return true;
      else return false;
    }
}