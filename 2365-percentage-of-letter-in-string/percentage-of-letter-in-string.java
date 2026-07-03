class Solution {
    public int percentageLetter(String s, char letter) {
        int percentage = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter)
                count++;
        }
        return percentage = (count * 100) / s.length();
    }
}