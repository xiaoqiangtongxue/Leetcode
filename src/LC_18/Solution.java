package LC_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int j = 0; j < nums.length; j++){
            if (j > 0 && nums[j] == nums[j - 1]) {             //qu chong
                continue;
            }
            for (int i = j + 1; i < nums.length; i++) {
                if (i > j + 1 && nums[i] == nums[i - 1]) {             //qu chong
                    continue;
                }
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long) nums[i] +(long) nums[left] + (long)nums[right] + (long)nums[j];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[j]);
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
        int target = cin.nextInt();
        List<List<Integer>> res =  fourSum(nums, target);
        System.out.println(res.toString());
    }
}
