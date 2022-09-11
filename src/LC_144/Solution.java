package LC_144;

import util.TreeNode;

import java.util.*;

import static util.TreeNode.buildTree;

public class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] str = cin.nextLine().split(",");
        TreeNode root = buildTree(str, 1);
        System.out.println(preorderTraversal(root).toString());

    }
    public static  List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if(root == null){
            return res;
        }
        stack.push(root);
        while(!stack.isEmpty()){
           TreeNode node =  stack.pop();
           res.add(node.val);
           if(node.right != null){
               stack.push(node.right);
           }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return res;
    }
}
