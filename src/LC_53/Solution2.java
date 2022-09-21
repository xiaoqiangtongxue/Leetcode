package LC_53;

public class Solution2 {
    // dp
    // you hua kong jian fu za du
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max =  nums[0];
        int pre = nums[0];
        for(int i = 1; i < n; i++){
           if(pre < 0){
               max = Math.max(max, nums[i]);
               pre = nums[i];
           }else{
               max = Math.max(max, nums[i] + pre);
               pre = nums[i] + pre;
           }
        }
        return max;
    }
}
