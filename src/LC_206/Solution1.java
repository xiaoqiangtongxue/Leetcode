package LC_206;

import util.ListNode;

public class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode  temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return  pre;
    }
}
