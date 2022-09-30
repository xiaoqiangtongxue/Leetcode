package LC_674;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        int res = findLengthOfLCIS(nums);
        System.out.println(res);
    }
    public  static  int findLengthOfLCIS(int[] nums) {
        int res = 1;
        int n = nums.length;
       int pre = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                pre = pre + 1;
            }else{
                pre = 1;
            }
            res = Math.max(res, pre);
        }
        return  res;
    }
}
