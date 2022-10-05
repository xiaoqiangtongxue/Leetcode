package LC_203;

import util.ListNode;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int val  = cin.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        ListNode head = ListNode.creatList(nums);
        Solution1 s =new Solution1();
        ListNode node = s.removeElements(head, val);
    }
}
