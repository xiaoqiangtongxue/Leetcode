package LC_78;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static  List<List<Integer>> res  =  new ArrayList<>();
    static  List<Integer> path = new ArrayList<>();
    public  static  void dfs(int[] nums, int start){
        res.add(new ArrayList<>(path));
        for(int i = start; i < nums.length; i++){
            path.add(nums[i]);
            dfs(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int i  = 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        dfs(nums, 0);
        System.out.println(res.toString());
    }

}
