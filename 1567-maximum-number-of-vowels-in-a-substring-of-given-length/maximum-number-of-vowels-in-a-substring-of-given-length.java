class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                count++;
        }
        max = count;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
                count++;
            if (isVowel(s.charAt(i - k)))
                count--;
        max = Math.max(max, count);
    }
 return max;
 }
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' | ch == 'u';
    }
}
/*       for (int i = 0; i <= ch.length - k; i++) {
           int count = 0;
           for (int j = i; j < i + k; j++) {
               if (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u') {
                   count++;
               }
           }
           max = Math.max(max, count);
       }
       return max;
   }
}
*/