package missiong.favoriteportal;

import java.util.Scanner;

public class DiameterOfATree {
    private static int max = 0;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t!=0){
            int n = in.nextInt();
            TreeNode root = null;
            max = 1;
            while (n!=0){
                int val = in.nextInt();
                root = insert(root, val);
                n--;
            }
            System.out.println(diamterOfATree(root)+1);
            t--;
        }
    }

    private static int diamterOfATree(TreeNode root) {
        maxDepth(root);
        return max;
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
