package missiong.TreeDataStructures;

public class HeightOrDepthOfABinaryTree {
    public int maxDepthRecursive(BinaryTreeNode root){
        if (root == null ){
            return 0;
        }
        int leftDepth = maxDepthRecursive(root.left);
        int rightDepth = maxDepthRecursive(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

}
