package LC_63;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int[][] nums = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0 ; j < n; j++){
                nums[i][j] = cin.nextInt();
            }
        }
        int res = uniquePathsWithObstacles(nums);
        System.out.println(res);
    }
    public  static int  uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m  = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            if(obstacleGrid[i][0] == 1){
                dp[i][0] = 0;
                break;
            }
            dp[i][0] = 1;
        }
        for(int j = 0; j < n; j++){
            if(obstacleGrid[0][j] == 1){
                dp[0][j] = 0;
                break;
            }
            dp[0][j] = 1;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = dp[i - 1][j ] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
