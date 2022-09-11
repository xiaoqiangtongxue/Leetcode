package LC_2;
import util.ListNode;

import java.util.Scanner;
public class Solution {
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {   //jian dan mo ni
        int tag = 0;
        ListNode head = null, cur =null;
        while(l1 != null || l2 != null){
            int n = l1 == null ? 0 : l1.val;
            int m = l2 == null ? 0 : l2.val;
            int sum = n + m + tag;
            tag = sum / 10;
            int val = sum % 10;
            if(head == null){
                head = new ListNode(val);
                cur = head;
            }else{
                cur.next = new ListNode(val);
                cur = cur.next;
            }
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(tag == 1){
            cur.next = new ListNode(tag);
        }
        return head;
    }



    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int[] nums1 = new int[m ];
        int[] nums2 = new int[n ];
        for(int i = 0; i < m; i++){
            nums1[i] = cin.nextInt();
        }
        for(int i = 0; i < n; i++){
            nums2[i] = cin.nextInt();
        }
        ListNode L1 = ListNode.creatList(nums1);
        ListNode L2 = ListNode.creatList(nums2);
        ListNode head = addTwoNumbers(L1, L2);
        ListNode.show(head);
    }
}
