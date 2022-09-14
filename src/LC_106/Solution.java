package LC_106;

import util.TreeNode;

public class Solution {
    public static void main(String[] args) {

    }
    public static  TreeNode buildTree(int[] inorder, int[] postorder) {
        int size = postorder.length;
        return build(postorder,inorder, 0, size - 1, 0 , size - 1);
    }
    public  static TreeNode  build(int[] post, int[] in, int postLeft, int postRight, int midLeft, int midRight){
        if(postLeft > postRight){
            return null;
        }
        TreeNode root = new TreeNode(post[postRight]);
        int i = midLeft;
        for(; i < midRight; i++){
            if(in[i] == post[postRight]){
                break;
            }
        }
        int len = i - midLeft;
        root.left = build(post, in,  postLeft, postLeft + len - 1 , midLeft, i - 1);
        root.right = build(post,in, postLeft + len, postRight - 1, i + 1, midRight);
        return root;
    }
}
