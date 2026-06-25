class Solution {
    public boolean winnerOfGame(String colors) {
        int aliceCount = 0;
        int bobCount = 0;
        for (int i = 2; i < colors.length(); i++) {
            if (colors.charAt(i) == 'A' && colors.charAt(i - 1) == 'A' && colors.charAt(i - 2) == 'A')
                aliceCount++;
            if (colors.charAt(i) == 'B' && colors.charAt(i - 1) == 'B' && colors.charAt(i - 2) == 'B')
                bobCount++;
        }
        return aliceCount > bobCount;
    }
}