package LC_376;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        System.out.println(wiggleMaxLength(nums));
    }
    public static  int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 1;
        }
        int pre = 0;
        int res = 0;
        for(int i = 1; i < n; i++){
            if(i == 1){
                pre = nums[i] - nums[i - 1];
                if(pre != 0){
                    res = 2;
                }else{
                    res = 1;
                }
            }else{
                int temp = nums[i] - nums[i - 1];
                if(temp == 0){
                    continue;
                }
                if(temp < 0 && pre >= 0){
                    res += 1;
                }
                if(temp > 0 && pre <= 0){
                    res += 1;
                }
                pre = temp;
            }
        }
        return res;
    }
}
