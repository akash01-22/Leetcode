class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int player1Sum = 0;
        int player2Sum = 0;
        for (int i = 0; i < player1.length; i++) {
            if ((i >= 1 && player1[i - 1] == 10) || (i >= 2 && player1[i - 2] == 10))
                player1Sum += 2 * (player1[i]);
            else
                player1Sum += player1[i];
        }
        for (int i = 0; i < player2.length; i++) {
            if ((i >= 1 && player2[i - 1] == 10) || (i >= 2 && player2[i - 2] == 10))
                player2Sum += 2 * (player2[i]);
            else
                player2Sum += player2[i];
        }
        if (player1Sum > player2Sum)
            return 1;
        else if (player1Sum < player2Sum)
            return 2;
        else
            return 0;
    }
}