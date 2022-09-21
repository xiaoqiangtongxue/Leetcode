package LC_300;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int  i = 0;i < n; i++){
            nums[i] = cin.nextInt();
        }
        Solution1 s = new Solution1();
        System.out.println(s.lengthOfLIS(nums));
    }
}
