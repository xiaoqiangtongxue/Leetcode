package LC_647;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        int res = countSubstrings(s);
        System.out.println(res);
    }
    public static  int countSubstrings(String s) {
         int n = s.length();
         boolean[][] dp = new boolean[n][n];
         int ans = 0;
         for(int i = n - 1; i >= 0; i--){
             for(int j = i; j < n; j++){
                 if(s.charAt(i) == s.charAt(j) &&(j - i < 2 || dp[i+1][j- 1] )){
                     dp[i][j] = true;
                     ans++;
                 }
             }
         }
         return ans;

    }
}
