package LC_738;

public class Solution {
    public int monotoneIncreasingDigits(int n) {
        String s =  String.valueOf(n);
        StringBuffer sb = new StringBuffer(s);
        int tag = -1;
        for(int i = sb.length() - 2; i >= 0; i--){
            char x1 = sb.charAt(i);
            char x2 = sb.charAt(i + 1);
            if(x1 > x2){
                char ch = sb.charAt(i);
                int temp = (ch - '0')  - 1;
                ch  = (char) (temp + '0');
                sb.setCharAt(i,  ch );
                tag = i;
            }
        }
        if(tag != -1) {
            for (int i = tag + 1; i < sb.length(); i++) {
                sb.setCharAt(i, '9');
            }
        }
        return  Integer.valueOf(sb.toString());
    }
}
