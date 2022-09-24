package LC_47;

import java.awt.image.AreaAveragingScaleFilter;
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
        Arrays.sort(nums);
        int[] visit = new int[21];
        ArrayList<Integer> path = new ArrayList<>();
        dfs(nums, visit, path);
        for(List<Integer> temp: res){
            System.out.println(temp.toString());
        }
    }
    public  static  void dfs(int[] nums, int[]visit, ArrayList<Integer> path){
        if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visit[i] == 1){
                continue;
            }
            if(i > 0 && nums[i] == nums[i - 1] && visit[i - 1] == 0){
                continue;
            }
            visit[i] = 1;
            path.add(nums[i]);
            dfs(nums, visit, path);
            visit[i] = 0;
            path.remove(path.size() - 1);
        }
    }
}
