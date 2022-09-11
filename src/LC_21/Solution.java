package LC_21;

import util.ListNode;

import java.util.Scanner;

public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = new ListNode(list1.val);
                list1 = list1.next;
            }else if(list1.val > list2.val){
                cur.next = new ListNode(list2.val);
                list2 = list2.next;
            }else{
                cur.next = new ListNode(list1.val);
                cur = cur.next;
                cur.next = new ListNode(list2.val);
                list1 = list1.next;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 != null){
            cur.next = list1;
        }
        if(list2 != null){
            cur.next = list2;
        }
        return head.next;
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
        ListNode head = mergeTwoLists(L1, L2);
        ListNode.show(head);
    }
}
