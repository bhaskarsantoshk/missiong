package missiong.favoriteportal;

public class LeftViewOfABinaryTree {
    public static TreeNode insert(TreeNode root, int val){
        if (root == null ){
            root = new TreeNode(val);
        }
        else if (root.data <= val){
            root.right = insert(root.right,val);
        }
        else{
            root.left=insert(root.left, val);
        }
        return root;
    }
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode (int val){
            this.data =val;
            this.left = null;
            this.right = null;
        }
    }
}
