package LC_145;

import util.TreeNode;

import util.TreeNode;

import java.util.*;

import static util.TreeNode.buildTree;

public class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Scanner cin1= new Scanner(System.in);
        String[] str = cin.nextLine().split(",");
        TreeNode root = buildTree(str, 1);
        System.out.println(postorderTraversal(root).toString());
        System.out.println(cin);

        System.out.println(cin.equals(cin1));

    }
    public static  List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if(root == null){
            return res;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node =  stack.pop();
            res.add(node.val);

            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
