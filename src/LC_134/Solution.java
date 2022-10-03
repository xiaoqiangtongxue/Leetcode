package LC_134;

import java.util.Scanner;

public class Solution {

    public static  int canCompleteCircuit(int[] gas, int[] cost) {
        int n = cost.length;
        for(int i = 0; i < n; i++){
            int load = gas[i] - cost[i];
            int j = (i + 1) % n;
            while (load > 0 && j != i ){
                load += (gas[j] - cost[j]);
                j = (j + 1) % n;
            }
           if(load >= 0 && j == i){
               return  i;
           }
        }
        return -1;
    }
}
