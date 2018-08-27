package leetcode;

public class P226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if ( root == null ){
            return root;
        }

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode ( int x){
            val = x;
        }
    }
}
