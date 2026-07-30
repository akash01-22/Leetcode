class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                k--;
            if (k == 0)
                return s.substring(0, i);
        }
        return s;
    }
}