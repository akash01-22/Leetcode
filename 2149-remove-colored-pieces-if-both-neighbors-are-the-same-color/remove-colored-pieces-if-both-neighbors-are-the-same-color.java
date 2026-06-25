class Solution {
    public boolean winnerOfGame(String colors) {
        int aliceCount = 0, consecutiveA = 0;
        int bobCount = 0, consecutiveB = 0;
        for (char ch : colors.toCharArray()) {

            if (ch == 'A') {
                consecutiveB = 0;
                consecutiveA++;
                if (consecutiveA >= 3)
                    aliceCount++;
            } else {
                consecutiveA = 0;
                consecutiveB++;
                if (consecutiveB >= 3)
                    bobCount++;
            }
        }
        return aliceCount > bobCount;
    }
}