package P1;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

 class Solution {
    public int maxDepth(TreeNode root){
        if( root == null ){
            return 0;
        }
        if( root.left == null && root.right == null){
            return 1;
        }
        int max = 0;
        int l = maxDepth(root.left)+1;
        int r = maxDepth(root.right)+1;
        if( l>r){
            max = l;
        }else{
            max = r;
        }
    return max;
    }

}

class solution2 {

}
