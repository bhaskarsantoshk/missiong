package missiong.favoriteportal;

import java.util.Scanner;
import java.util.Stack;

public class DepthOfTreeNodes {

   private static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t!=0){
            int n=in.nextInt();
            stack.clear();
            TreeNode root = null;
            while (n!=0){
                int val=in.nextInt();
                root = insert(root, val);
                n--;
            }

            depthOfTreeNodes(root,0);

            while (!stack.isEmpty()){
                System.out.print(stack.pop()+" ");
            }

            t--;
        }
    }

    private static int depthOfTreeNodes(TreeNode root, int depth) {
        if(root == null){
            return 0;
        }
        System.out.println("Pushing : "+depth +" for "+ root.data);
        stack.push(depth);
        int l = depthOfTreeNodes(root.left, depth+1);
        int r = depthOfTreeNodes(root.right, depth+1);
        depth = Math.max(l,r);
        return depth;
    }

    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;

        public TreeNode(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode insert(TreeNode root, int val){
        if(root == null) {
            root = new TreeNode(val);
        }
        else if(root.data <= val){
            root = insert (root.right, val);
        }
        else {
            root = insert( root.left, val);
        }

        return root;
    }
}
