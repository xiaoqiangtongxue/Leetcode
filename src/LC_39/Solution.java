package LC_39;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static  List<List<Integer>> res  =  new ArrayList<>();
    static  List<Integer> path = new ArrayList<>();
    public  static  void dfs(int[] nums, int start,int sum, int target){
        if(sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < nums.length && nums[i] + sum <= target; i++){     //nums[i] + sum <= target jianzhi
            path.add(nums[i]);
            dfs(nums, i , sum + nums[i], target);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int target = cin.nextInt();
        int[] nums = new int[n];
        for(int i  = 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        Arrays.sort(nums);                           //pai xu
        dfs(nums, 0, 0, target);
        System.out.println(res.toString());
    }

}

