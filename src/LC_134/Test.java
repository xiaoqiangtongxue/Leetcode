package LC_134;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n1 = cin.nextInt();
        int n2 = cin.nextInt();
        int[] nums1  = new int[n1];
        int[] nums2 =  new int[n2];
        for(int i = 0; i < n1; i++){
            nums1[i] = cin.nextInt();

        }
        for(int i = 0; i < n2; i++){
            nums2[i]  =cin.nextInt();
        }
        Solution1 t = new Solution1();
        int res = t.canCompleteCircuit(nums1, nums2);
        System.out.println(res);
    }
}
