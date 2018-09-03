package leetcode;

public class P572SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if ( t == null ){
            return true;
        }

        if ( s == null ){
            return false;
        }

        if ( isSameTree( s, t ) ){
            return true;
        }

        return isSubtree( s.left , t ) || isSubtree( s.right , t );
     }

    public boolean isSameTree(TreeNode s, TreeNode t){
        if(s == null && t == null ){
            return  true;
        }

        if( s== null || t == null ){
            return false;
        }

        return s.val == t.val && isSameTree( s.left , t.left ) && isSameTree( s.right , t.right );
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode (int val ){
            this.val = val;
            left = null;
            right = null;
        }
    }
}
