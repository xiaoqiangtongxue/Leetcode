package LC_1345;

import java.util.*;

public class Solution1 {
    // tu + BFS
    public static void main(String[] args) {
         Scanner cin = new Scanner(System.in);
         int n = cin.nextInt();
         int[] nums = new int[n];
         for(int i = 0; i < n; i++){
             nums[i] = cin.nextInt();
         }
         int res = minJumps(nums);
        System.out.println(res);
    }
    public static  int minJumps(int[] arr) {
        //creat graph
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            graph.computeIfAbsent(arr[i], key -> new ArrayList<>()).add(i);
        }
        Queue<Integer> qu = new ArrayDeque<>();
        qu.add(0);
        int count = 0;
        int[] visit = new int[arr.length];
        visit[0] = 1;
        while (!qu.isEmpty()){
            int size = qu.size();
            for(int i = 0; i < size; i++){
                int index = qu.poll();
                if(index == arr.length - 1){
                    return count;
                }
                if(graph.containsKey(arr[index])) {
                    ArrayList<Integer> l = graph.get(arr[index]);
                    for (int j = 0; j < l.size(); j++) {
                        if (l.get(j) != index && visit[l.get(j)] == 0) {
                            qu.add(l.get(j));
                            visit[l.get(j)] = 1;
                        }
                    }
                    graph.remove(arr[index]);
                }
                 if(index - 1 >= 0 && visit[index - 1] == 0){
                     qu.add(index - 1);
                     visit[index - 1] = 1;
                 }
                 if(index + 1 < arr.length && visit[index + 1] == 0){
                     qu.add(index + 1);
                     visit[index + 1] = 1;
                 }
            }
           count++;
        }
        return 0;
    }

}
