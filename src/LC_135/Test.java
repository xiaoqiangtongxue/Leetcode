package LC_135;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int i =0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.candy(nums));
    }
}
