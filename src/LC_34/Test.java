package LC_34;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n =  cin.nextInt();
        int target  = cin.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        Solution1 s = new Solution1();
        int[] res = s.searchRange(nums, target );
        System.out.println(res[0] + " " + res[1]);
    }
}
