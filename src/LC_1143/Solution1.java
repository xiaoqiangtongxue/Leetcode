package LC_1143;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s1 = cin.nextLine();
        String s2 = cin.nextLine();
        int res = longestCommonSubsequence(s1, s2);
        System.out.println(res);

    }
    public static  int longestCommonSubsequence(String text1, String text2) {
         int l1 = text1.length();
         int l2 = text2.length();
         int[][] dp  = new int[l1 + 1][l2 + 1];
         for(int i = 1; i <= l1; i++){
             for(int j = 1; j <= l2; j++){
                 if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                     dp[i][j] = dp[i-1][j-1] + 1;
                 }else {
                     dp[i][j] = Math.max(dp[i-1][j], dp[i][j - 1]);
                 }
             }
         }
         return dp[l1][l2];
    }
}
