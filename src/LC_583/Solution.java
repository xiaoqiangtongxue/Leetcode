package LC_583;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner  cin  = new Scanner(System.in);
        String s1 = cin.nextLine();
        String s2 = cin.nextLine();
        int res = minDistance(s1, s2);
        System.out.println(res);
    }
    public static  int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        for(int i = 0; i <= n1; i++){
            dp[i][0] = i;
        }
        for(int j = 0; j <= n2; j++){
            dp[0][j] = j;
        }
        for(int i = 1; i <= n1; i++){
            for(int j = 1; j <= n2; j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{

                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j-1] + 1), dp[i-1][j-1] + 2);
                }
            }
        }
        return  dp[n1][n2];
    }
}
