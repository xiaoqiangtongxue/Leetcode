package LC_1306;

import java.util.Arrays;

public class Solution1 {
    public boolean canReach(int[] arr, int start) {
        int[] tag = new int[arr.length];
        return dfs(arr, tag,  start );
    }
    public boolean dfs(int[] arr, int[] tag, int start){
        if( start < 0 || start > arr.length - 1 || tag[start] == 1){
            return false;
        }
        if(arr[start] == 0){
            return  true;
        }
        tag[start] = 1;
        boolean tag1 = dfs(arr, tag, start + arr[start]);
        boolean tag2 = dfs(arr, tag, start - arr[start]);
        return tag1 || tag2;
    }
}
