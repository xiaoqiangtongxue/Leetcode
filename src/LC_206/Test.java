package LC_206;

import util.ListNode;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        Solution s = new Solution();
        Solution1 s1 = new Solution1();
        ListNode head = ListNode.creatList(nums);
      //  ListNode res =  s.reverseList(head);
        ListNode res =  s1.reverseList(head);
        System.out.println(res.val);
    }
}
