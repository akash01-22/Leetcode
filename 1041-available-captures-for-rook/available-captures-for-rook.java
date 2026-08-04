class Solution {
    public int numRookCaptures(char[][] board) {
        int row = -1;
        int col = -1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        int captures = 0;
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'B')
                break;
            if (board[i][col] == 'p') {
                captures++;
                break;
            }
        }
        for (int i = row + 1; i < 8; i++) {
            if (board[i][col] == 'B')
                break;
            if (board[i][col] == 'p') {
                captures++;
                break;
            }
        }
        for (int j = col - 1; j >= 0; j--) {
            if (board[row][j] == 'B')
                break;
            if (board[row][j] == 'p') {
                captures++;
                break;
            }
        }
        for (int j = col + 1; j < 8; j++) {
            if (board[row][j] == 'B')
                break;
            if (board[row][j] == 'p') {
                captures++;
                break;
            }
        }
        return captures;
    }
}