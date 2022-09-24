package LC_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public  static List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner cin  = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int i= 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        int[] visit = new int[21];
        ArrayList<Integer> path = new ArrayList<>();
        dfs(nums, visit, path);

    }
    public  static  void dfs(int[] nums, int[] visit,  ArrayList<Integer> path){
        if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
        }
        for(int  i = 0; i < nums.length; i++){
            if(visit[nums[i] + 10]  == 1){
                continue;
            }
            path.add(nums[i]);
            visit[nums[i] + 10] = 1;
            dfs(nums, visit, path);
            path.remove(path.size() - 1);
            visit[nums[i] + 10] = 0;
        }
    }
}
