package LC_102;

import util.TreeNode;

import java.awt.desktop.QuitStrategy;
import java.util.*;

import static util.TreeNode.buildTree;

public class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] str = cin.nextLine().split(",");
        TreeNode root = buildTree(str, 1);
          System.out.println( levelOrder(root).toString());

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> qu = new ArrayDeque<>();
        qu.add(root);
        int n = 1;
        while (!qu.isEmpty()) {
            int index = 0;
            List<Integer> eachLevelNode = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode temp = qu.poll();
                eachLevelNode.add(temp.val);
                if (temp.left != null) {
                    qu.add(temp.left);
                    index++;
                }
                if (temp.right != null) {
                    qu.add(temp.right);
                    index++;
                }
            }
            n = index;
            res.add(eachLevelNode);

        }
        return res;
    }
}