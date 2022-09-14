package LC_105;

import util.TreeNode;

public class Solution {
    public static void main(String[] args) {

    }
    public static  TreeNode buildTree(int[] preorder, int[] inorder) {
        int size = preorder.length;
        return build(preorder, inorder, 0, size - 1, 0 , size - 1);
    }
    public  static TreeNode  build(int[] pre, int[] in, int preLeft, int preRight, int midLeft, int midRight){
        if(preLeft > preRight){
            return null;
        }
        TreeNode root = new TreeNode(pre[preLeft]);
        int i = midLeft;
        for(; i < midRight; i++){
            if(in[i] == pre[preLeft]){
                break;
            }
        }
        int len = i - midLeft;
        root.left = build(pre, in, preLeft + 1 , preLeft + len , midLeft, i - 1);
        root.right = build(pre,in, preLeft + len + 1, preRight, i + 1, midRight);
        return root;
    }
}
