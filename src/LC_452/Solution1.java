package LC_452;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1 {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return  0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                if(ints[1] > t1[1]){
                    return  1;
                }else if(ints[1] < t1[1] ){
                    return  -1;
                }else{
                    return 0;
                }
            }
        });
        int res = 1;
        int right = points[0][1];
        for(int[] point: points){
            if(point[0] > right){
                right = point[1];
                res++;
            }
        }
        return res;
    }
}
