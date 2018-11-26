package missiong.leetcode;

public class P543DiameterOfBinaryTree {
    static int max = 0;
    public static int diameterOfBinaryTree(TreeNode root){
        maxDepth(root);
        return max;
    }

    public static void main(String [] args){
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.right = new TreeNode(3);
        node.right.right.right= new TreeNode(4);
        node.right.right.right.right= new TreeNode(5);
        System.out.println(diameterOfBinaryTree(node)+1);
    }

    private static int maxDepth(TreeNode root){
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
