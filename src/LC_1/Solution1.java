package LC_1;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            mp.put(nums[i], i);
        }
        int[] res = new  int[2];
        for(int i = 0; i < nums.length; i++){
            int other = target - nums[i];
            if(mp.containsKey(other) && mp.get(other) != i){
                res[0] = i;
                res[1] = mp.get(other);
                break;
            }
        }
        return res;
    }
}
