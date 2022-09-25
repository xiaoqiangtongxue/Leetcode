package LC_980;

import java.util.Scanner;

public class Solution1 {
    static  int res = 0;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int[][] nums = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++) {
                nums[i][j] = cin.nextInt();
            }
        }
         uniquePathsIII(nums);
        System.out.println(res);
    }
    public static  int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int x = 0, y = 0;
        int targetx = 0, targety = 0;
        int count0 = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0 || grid[i][j] == 1 || grid[i][j] == 2){
                    count0++;
                }
                if(grid[i][j] == 1){
                    x = i;
                    y = j;
                }
                if(grid[i][j] == 2){
                    targetx = i;
                    targety = j;
                }
            }
        }
        int[][] visit = new int[m][n];
        dfs(grid,x, y, targetx, targety, m, n, count0, visit, 0);
        return res;
    }
    public static void dfs(int[][] nums, int x, int y, int targetx, int targety, int m, int n, int count0, int[][] visit, int path){
        if(x < 0 || y < 0 || x >= m || y >= n  || visit[x][y] == 1 || nums[x][y] == -1){
            return;
        }
        path++;
        if(x == targetx && y == targety ){
            if(path == count0  ){
                res++;
            }
        }
        visit[x][y] = 1;
        dfs(nums, x + 1, y, targetx, targety, m, n,count0, visit, path);
        dfs(nums, x - 1, y, targetx, targety, m, n,count0, visit, path);
        dfs(nums, x, y + 1, targetx, targety, m, n,count0, visit, path);
        dfs(nums, x, y - 1, targetx, targety, m, n,count0, visit, path);
        visit[x][y] = 0;
        path--;
    }
}
