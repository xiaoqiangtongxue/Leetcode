package LC_226;

import util.TreeNode;

import java.awt.desktop.QuitStrategy;
import java.util.*;

import static util.TreeNode.buildTree;

public class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] str = cin.nextLine().split(",");
        TreeNode root = buildTree(str, 1);
   //     System.out.println( levelOrder(root).toString());

    }

    public TreeNode invertTree(TreeNode root) {
        //  condition of return
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
