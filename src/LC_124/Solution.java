package LC_124;

import util.TreeNode;

import java.util.Collections;

public class Solution {
    static  int res = Integer.MIN_VALUE;
    public static void main(String[] args) {

    }

    public static int maxPathSum(TreeNode root) {
        if(root == null ){
            return 0;
        }
        dfs(root);
        return res;
    }
    public static  int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0,dfs(root.left));
        int right = Math.max(0,dfs(root.right));
        res = Math.max(res, root.val + left + right);
        return root.val + Math.max(left, right);
    }
}
