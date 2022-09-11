package LC_19;

import util.ListNode;

import java.util.Scanner;

public class Solution {
    public static  ListNode removeNthFromEnd(ListNode head, int n) {   //kuai man zhizhen
            ListNode L = new ListNode(0, head);
            ListNode cur = L, back = L;
            while(cur.next != null && n != 0){
                cur = cur.next;
                n--;
            }
            while(cur.next != null){
                cur = cur.next;
                back = back.next;
            }
            ListNode temp = back.next.next;
            back.next = temp;
            return L.next;
        }


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int[] nums = new int[n ];
        for(int i = 0; i < n; i++){
            nums[i] = cin.nextInt();
        }
        ListNode head = ListNode.creatList(nums);
        head = removeNthFromEnd(head, m);
        ListNode.show(head);
    }
}
