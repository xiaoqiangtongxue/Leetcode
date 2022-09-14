package util;
// the tools  of tree
public class TreeNode {
     public int val;
    public TreeNode left;
      public TreeNode right;
      TreeNode() {}
      public TreeNode(int val) { this.val = val; }
      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

      public static TreeNode buildTree(String[] str, int index){
          TreeNode root = null;
          if(index < str.length){
              if(str[index] != "NULL"){
                  root = new TreeNode(Integer.parseInt(str[index]));
                  root.left = buildTree(str, 2 * index);
                  root.right = buildTree(str, index * 2 + 1);
              }
          }
          return root;
      }
};
