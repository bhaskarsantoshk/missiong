package missiong.favoriteportal;

import java.util.Scanner;
import java.util.Stack;

public class ZigZagTraversalOfATree {

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
            zigZag(root);
            System.out.println();
            t--;
        }
    }

    private static void zigZag(TreeNode root) {
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();

        boolean rightToLeft = true;
        currentLevel.push(root);

        while(currentLevel.isEmpty()==false){
            TreeNode node = currentLevel.pop();
            System.out.print(node.data+" ");
            if(rightToLeft){
                if(node.right!=null){
                    nextLevel.push(node.right);
                }
                if(node.left!=null){
                    nextLevel.push(node.left);
                }
            }
            else{

                if(node.left!=null){
                    nextLevel.push(node.left);
                }

                if(node.right!=null){
                    nextLevel.push(node.right);
                }

            }



            if(currentLevel.isEmpty()){
                Stack<TreeNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
                rightToLeft=!rightToLeft;
            }
        }



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
