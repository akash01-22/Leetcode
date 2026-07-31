class Solution {
    public String thousandSeparator(int n) {
        //  String output = String.format("%,d", n);
        //   return output.replace(',','.');
        StringBuilder sb = new StringBuilder();
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.length() - i) % 3 == 0)
                sb.append('.');
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}