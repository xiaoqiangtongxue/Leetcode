package util;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val){this.val = val;};
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    public  static  void show(ListNode head){     //shuchu
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public static ListNode creatList(int[] nums) {          //chaung jian lian biao
        if(nums.length == 0){
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for(int i = 1; i < nums.length; i++){
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        return head;
    }
    public static void show(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        show(root.left);
        show(root.right);
    }

}
