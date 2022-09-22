package LC_45;

public class Solution1 {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        int curcover = 0;
        int nextcover = 0;
        int minjump = 0;
        for(int i = 0; i < n; i++){
            nextcover = Math.max(nextcover, i + nums[i]);
            if(i == curcover){
                if(curcover != n - 1){
                    curcover = nextcover;
                    minjump++;
                    if(curcover > n -1){
                        break;
                    }
                }else{
                    break;
                }
            }

        }
        return  minjump;
    }
}
