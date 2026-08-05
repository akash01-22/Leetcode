class Solution {
    public int[] diStringMatch(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int[] arr = new int[n + 1];
        int left = 0;
        int right = n;
        for (int i = 0; i < n; i++) {
            if (ch[i] == 'I')
                arr[i] = left++;
            else
                arr[i] = right--;
        }
        arr[n] = left;
        return arr;
    }
}