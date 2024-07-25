package LC_234;

import util.ListNode;

public class Solution {
    //借助辅助数组
    public boolean isPalindrome(ListNode head) {
        int[] nums = new int[100000];
        int index = 0;
        while(head != null){
            nums[index++] = head.val;
            head = head.next;
        }
        return isPalin(nums, index - 1);
    }
    public boolean isPalin(int[] nums, int length){
        int i = 0;
        int j = length ;
        while(i <= j){
            if(nums[i] != nums[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
