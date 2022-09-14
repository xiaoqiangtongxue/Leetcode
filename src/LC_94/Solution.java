package LC_94;

import util.TreeNode;

import java.util.*;

import static util.TreeNode.buildTree;

public class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] str = cin.nextLine().split(",");
        TreeNode root = buildTree(str, 1);
        System.out.println( inorderTraversal(root).toString());

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack  =  new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        while (!stack.isEmpty() || root != null){
            if(root != null) {
                stack.push(root);
                root = root.left;
            }else{
                TreeNode temp = stack.pop();
                res.add(temp.val);
                root = temp.right;
            }
        }
        return res;
    }
}
