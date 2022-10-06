package LC_206;

import util.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = null;
        head.next = null;
        return node;
    }
}
