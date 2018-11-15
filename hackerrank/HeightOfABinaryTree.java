package missiong.hackerrank;

public class HeightOfABinaryTree {

    public static int height(Node root) {
        // Write your code here.
        if( root == null ){
            return 0;
        }

        if( root.left == null && root.right == null ){
            return 0;
        }

        int left = height ( root.left ) + 1 ;
        int right = height ( root.right ) + 1;

        return Math.max ( left, right );
    }


    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

}
