package LC_209;

import java.util.Scanner;

public class Solution {
    public static  int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == target){
                    res = Math.min(res, j - i + 1);
                    break;
                }else if(sum > target){
                    break;
                }
            }
        }
        return res == Integer.MAX_VALUE ? 0: res;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        System.out.println(minSubArrayLen(11, nums));
    }
}
