package LC_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                if(ints[0] > t1[0]){
                    return 1;
                }else if(ints[0] < t1[0]){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        int left = intervals[0][0];
        int Max = intervals[0][1];
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int[] interval: intervals){
            if(interval[0] > Max){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(left);
                temp.add(Max);
                res.add(temp);
                left = interval[0];
                Max = interval[1];
            }else{
                Max = Math.max(Max, interval[1]);
            }
        }
        ArrayList<Integer> temp1 =  new ArrayList<>();
        temp1.add(left);
        temp1.add(Max);
        res.add(temp1);
       int[][] ans =  new int[res.size()][2];
        for(int i = 0; i < res.size(); i++){
             ans[i][0]  = res.get(i).get(0);
            ans[i][1]  = res.get(i).get(1);
        }
        return  ans;
    }
}
