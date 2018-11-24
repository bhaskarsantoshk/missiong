package missiong.favoriteportal;

import java.util.Scanner;

public class IsBalancedTree {
    private static boolean result = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t != 0) {
            result = true;
            int n = in.nextInt();
            TreeNode root = null;
            while (n != 0) {
                int x = in.nextInt();
                root = insert(root, x);
                n--;
            }
            if ( isBalancedTree(root) == true ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            t--;
        }
    }

    private static boolean isBalancedTree(TreeNode root) {
        maxDepth(root);
        return result;
    }

    private static int maxDepth(TreeNode root) {
        if(root == null ) {
            return 0;
        }
        int left =maxDepth(root.left);
        int right = maxDepth(root.right);

        if(Math.abs(left-right) > 1){
            result = false;
        }
        return  1 + Math.max(left, right);
    }


    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
    }

    static TreeNode insert(TreeNode root, int val){
        if (root == null ){
            root = new TreeNode();
            root.data= val;
        }
        else if(root.data<=val){
            root.right = insert(root.right,val);
        }
        else{
            root.left = insert(root.left, val);
        }
        return root;
    }
}
