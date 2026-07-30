class Solution {
    public boolean squareIsWhite(String coordinates) {
        int character = (coordinates.charAt(0) - 'a') + 1;
        int number = coordinates.charAt(1);
        return (character + number) % 2 == 1;
    }
}