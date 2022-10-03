package LC_134;

public class Solution2 {
    public static  int canCompleteCircuit(int[] gas, int[] cost) {
        int len = cost.length;
        int tolsum = 0;
        int cur = 0;
        int start = 0;
        for(int i = 0; i < len; i++){
            cur += gas[i] - cost[i];
            tolsum += gas[i] - cost[i];
            if(cur < 0){
                start = i + 1;
                cur = 0;
            }
        }
        return tolsum < 0 ? -1 : start % len;
    }
}
