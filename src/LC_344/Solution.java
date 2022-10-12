package LC_344;

public class Solution {
    public void reverseString(char[] s) {
       StringBuffer sb = new StringBuffer();
       for(int i = 0; i < s.length; i++){
           sb.append(s[i]);
       }
       sb.reverse();
       for(int  i = 0; i < sb.length(); i++){
           s[i] = sb.charAt(i);
       }
    }
}
