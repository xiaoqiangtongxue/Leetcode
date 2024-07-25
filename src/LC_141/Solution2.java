package LC_141;

import util.ListNode;

public class Solution2 {
    //更好理解，快慢指针
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast  != null){
            if(fast.next != null){
                fast = fast.next.next;
            }else{
                return false;
            }
            slow = slow.next;
            if(fast == slow){
                return true;
            }

        }
        return false;
    }
}
