package LC_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
  // shuang zhi zhen + paixu
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {             //qu chong
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    while(left < right && nums[right - 1] == nums[right]){
                        right--;
                    }
                    while(left < right && nums[left] == nums[left + 1]){          //quchong
                        left++;
                    }
                    left++;
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        List<List<Integer>> res =  threeSum(nums);
        System.out.println(res.toString());
    }
}


