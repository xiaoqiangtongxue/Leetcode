package LC_55;

public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n <= 1){
            return  true;
        }
        int max = 0;
        for(int i = 0; i <= max ; i++){
            max = Math.max(max, i + nums[i]);
            if(max >= n - 1){
                return  true;
            }
        }
        return false;
    }
}
