package missiong.favoriteportal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderOfTree {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t!=0){
            int n = in.nextInt();
            TreeNode root = null;
            while (n!=0){
                int val = in.nextInt();
                root = insert(root, val);
                n--;
            }
            levelOrderOfATree(root);
            t--;
        }
    }

    private static void levelOrderOfATree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        

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
