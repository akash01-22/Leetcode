class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int temp=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0||j>=0||temp==1){
            if(i>=0) temp+=a.charAt(i--)-'0';
            if(j>=0) temp+=b.charAt(j--)-'0';
            sb.append(temp%2);
            temp/=2;
        }
        return sb.reverse().toString();
    }
}