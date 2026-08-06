class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set1 = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (set1.contains(matrix[i][j])) {
                    return false;
                }
                set1.add(matrix[i][j]);
            }
        }
        for (int j = 0; j < n; j++) {
            HashSet<Integer> set2 = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (set2.contains(matrix[i][j])) {
                    return false;
                }
                set2.add(matrix[i][j]);
            }
        }
        return true;
    }
}