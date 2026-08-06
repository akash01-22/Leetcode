class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] freq = new int[26];
        for (int i = 0; i < order.length(); i++) {
            freq[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            String st1 = words[i];
            String st2 = words[i + 1];
            int j = 0;
            while (j < st1.length() && j < st2.length()) {
                char ch1 = st1.charAt(j);
                char ch2 = st2.charAt(j);
                if (ch1 == ch2) {
                    j++;
                    continue;
                }
                int position1 = freq[ch1 - 'a'];
                int position2 = freq[ch2 - 'a'];
                if (position1 > position2) {
                    return false;
                }
                break;
            }
            if (j == st2.length() && st1.length() > st2.length())
                return false;
        }
        return true;
    }
}