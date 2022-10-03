package LC_452;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner  cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[][] nums = new int[n][2];
        for(int i = 0; i < n; i++){
            nums[i][0] = cin.nextInt();
            nums[i][1] = cin.nextInt();
        }
        Solution1 s = new Solution1();
        s.findMinArrowShots(nums);
    }
}
