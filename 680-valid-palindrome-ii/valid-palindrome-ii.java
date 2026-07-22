class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                int i = left + 1;
                int j = right;
                boolean leftPointer = true;
                while (i < j) {
                    if (s.charAt(i) != s.charAt(j)) {
                        leftPointer = false;
                        break;
                    }
                    i++;
                    j--;
                }
                i = left;
                j = right - 1;
                boolean rightPointer = true;
                while (i < j) {
                    if (s.charAt(i) != s.charAt(j)) {
                        rightPointer = false;
                        break;
                    }
                    i++;
                    j--;
                }
                return (leftPointer || rightPointer);
            }
        }
        return true;
    }
}