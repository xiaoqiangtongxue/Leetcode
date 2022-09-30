package LC_392;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {

    }
    public boolean isSubsequence(String s, String t) {
        int n1= s.length();
        int n2 = t.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        for(int i = 1; i <= n1; i++){
            for(int j = 1; j <= n2; j++){
                if(s.charAt(i-1) == t.charAt(j -1)){
                    dp[i][j] = dp[i-1][j -1] + 1;
                }else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[n1][n2] == s.length();
    }
}
