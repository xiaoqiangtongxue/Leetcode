package LC_718;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n1 = cin.nextInt();
        int n2 = cin.nextInt();
        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];
        for(int i = 0; i < n1; i++){
            nums1[i] = cin.nextInt();
        }
        for(int i = 0; i < n2; i++){
            nums2[i] =cin.nextInt();
        }
       int res = findLength(nums1, nums2);
        System.out.println(res);
    }

    public static  int findLength(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int res = 0;
        int[][] dp = new int[n1 + 1][n2 + 1];
        for(int i = 0; i < n1 ; i++){
            for(int j = 0; j < n2; j++){
                if(nums1[i] == nums2[j]){
                    dp[i + 1][j + 1] = dp[i][j]  + 1;
                }
                if(dp[i+1][j + 1] > res ){
                    res = dp[i + 1][j + 1];
                }
            }
        }
       return res;
    }
}
