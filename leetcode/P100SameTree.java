package leetcode;

public class P100SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null && q == null ){
            return true;
        }
        if( p == null || q == null ){
            return false;
        }
        return p.val == q.val && isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val = x;
        }
    }
}
