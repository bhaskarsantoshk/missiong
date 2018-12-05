package missiong.favoriteportal;

import java.util.Scanner;

public class LeftViewOfABinaryTree {
    static TreeNode root = null;
    static int max_level = 0;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t!=0){
            int n = in.nextInt();
            root = null;
            max_level = 0;
            while (n!=0){
                int val = in.nextInt();
                root = insert(root, val);
                n--;
            }
            //leftViewOfATree(root);
            rightViewOfATree(root);
            System.out.println();
            t--;
        }
    }
    private static void leftViewOfATree(TreeNode root) {
        printLeftView(root,1);
    }
    private static void rightViewOfATree(TreeNode root) {
        printRightView(root,1);
    }

    private static void printLeftView(TreeNode root, int level) {
        if(root == null){
            return;
        }
        if(max_level<level){
            System.out.print(root.data+" ");
            max_level = level;
        }
        printLeftView(root.right, level+1);
        printLeftView(root.left,level+1);
    }
    private static void printRightView(TreeNode root, int level) {
        if(root == null){
            return;
        }
        if(max_level<level){
            System.out.print(root.data+" ");
            max_level = level;
        }
        printRightView(root.left, level+1);
        printRightView(root.right,level+1);
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
