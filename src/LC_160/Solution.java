package LC_160;

import util.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode pa  =headA;
        ListNode pb = headB;
        while(pa != pb){
            pa =  pa == null ? headB : pa.next;
            pb =  pb ==null ? headA:  pb.next;
        }
        return pa;
    }
}
