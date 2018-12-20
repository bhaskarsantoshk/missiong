package leetcode;
public class P104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if ( root == null ){
            return 0;
        }
        int leftDepth = maxDepth( root.left );
        int rightDepth = maxDepth( root.right );
        int maxDepth = Math.max( leftDepth , rightDepth ) + 1;
        return maxDepth;
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x){
            this.val=x;
        }
    }
}
