package LC_203;

import util.ListNode;
// lian biao
public class Solution1 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode Head = new ListNode(0, head);
        ListNode cur = Head;
        while (cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return Head.next;
    }
}
