class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = new int[2];
        int max = 0;
        for (int i = 0; i < mat.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != 0)
                    onesCount++;
            }
            //   max=Math.max(max,onesCount);
            if (onesCount > max) {
                max = onesCount;
                arr[0] = i;
                arr[1] = max;
            }
        }
        return arr;
    }
}