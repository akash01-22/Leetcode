class Solution {
    public int minOperations(String[] logs) {
        int d = 0;
        for (String s : logs)
            if (s.equals("../"))
                d = Math.max(0, d - 1);
            else if (!s.equals("./"))
                d++;
        return d;
    }
}