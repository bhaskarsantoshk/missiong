package missiong.treesandgraphs;

import java.util.Stack;

public class ZigZagTraversalOfATree {
    static Node root = null;
    public static void main(String[] args){
        Node root= new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        zigZagTrversal(root);
    }

    private static void zigZagTrversal(Node root) {
        Stack<Node> currentLevel = new Stack<Node>();
        Stack<Node> nextLevel = new Stack<>();
        boolean leftToRight = true;
        currentLevel.push(root);
        while(!currentLevel.isEmpty()){
            Node node = currentLevel.pop();
            System.out.print(node.data+" ");
            if(leftToRight==true){
                if(node.left!=null){
                    nextLevel.push(node.left);
                }
                if(node.right!=null){
                    nextLevel.push(node.right);
                }
            }
            else{
                if(node.right!=null){
                    nextLevel.push(node.right);
                }
                if(node.left !=null){
                    nextLevel.push(node.left);
                }
            }
            if(currentLevel.isEmpty()){
                leftToRight=!leftToRight;
                Stack<Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
}
