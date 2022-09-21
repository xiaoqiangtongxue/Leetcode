package LC_300;

import java.util.Arrays;

public class Solution1 {
    //dp

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 1; i < n; i++){
            for(int j = i - 1; j >= 0; j--){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        int max = Integer.MIN_VALUE;
       for(int i  = 0; i < n; i++){
           max = Math.max(max, dp[i]);
       }
       return max;
    }
}
