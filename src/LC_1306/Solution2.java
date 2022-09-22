package LC_1306;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution2 {
    //BFS
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> qu = new ArrayDeque<>();
        int[] visit = new  int[arr.length];
        qu.add(start);
        visit[start] = 1;
        while (!qu.isEmpty()){
            int index =  qu.poll();
            if(arr[index] == 0){
                return true;
            }
            int left = index - arr[index];
            if(left >= 0){
                if(visit[left] != 1){
                    qu.add(left);
                    visit[left] = 1;
                }
            }
            int right = index + arr[index];
            if(right <= arr.length - 1){
                if(visit[right] != 1){
                    qu.add(right);
                    visit[right] = 1;
                }
            }
        }
        return false;
    }
}
