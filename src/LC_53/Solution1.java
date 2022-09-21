package LC_53;

public class Solution1 {
    // dp
    //zhuang tai zhuanyi hanshu
    // dp[i] = nums[i]   if dp[i-1] < 0;
    // dp[i] = nums[i] + dp[i - 1] if dp[i-1] >= 0
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}
