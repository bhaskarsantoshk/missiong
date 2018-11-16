package missiong.hackerrank;

public class CheckBST {
    class Node {
        Node left;
        Node right;
        int data;

        Node( int data ) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    boolean checkBST(Node root) {
        Node prev = null;
        return checkBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBSTHelper( Node root, int min , int max) {
        if ( root == null ){
            return true;
        }

        if ( root.data < min || root.data > max ){
            return false;
        }

        return checkBSTHelper(root.left, min , root.data-1) && checkBSTHelper(root.right, root.data+1, max);
    }
}
