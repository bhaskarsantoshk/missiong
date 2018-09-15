package leetcode;

public class P543DiameterOfBinaryTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root){
        maxDepth(root);
        return max;
    }

    private int maxDepth(TreeNode root){
        if ( root == null ){
            return 0;
        }

        int left = maxDepth ( root.left );
        int right = maxDepth ( root.right );

        max = Math.max( max , left + right );

        return Math.max ( left , right) + 1 ;
    }


}

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int val){
        this.val = val;
    }
}
