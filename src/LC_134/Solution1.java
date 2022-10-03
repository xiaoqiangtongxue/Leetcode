package LC_134;

public class Solution1 {
    public static  int canCompleteCircuit(int[] gas, int[] cost) {
        int len = cost.length;
        int spare =  0;
        int minSpare = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < len; i++){
            spare += gas[i] - cost[i];
            if(spare < minSpare){
                minSpare  = spare;
                minIndex = i;
            }
        }
        if(spare < 0){
            return  -1;
        }
        return  minIndex + 1;
    }
}
