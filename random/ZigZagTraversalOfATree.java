package missiong.random;

import java.util.Stack;

public class ZigZagTraversalOfATree {

    Node root;

    public static void main(String[] args) {
        ZigZagTraversalOfATree tree = new ZigZagTraversalOfATree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);

        System.out.println("ZigZag Order traversal of binary tree is");
        tree.printZigZagTraversal();
    }

    private void printZigZagTraversal() {
        if(root == null){
            return;
        }

        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();

        boolean leftToRight = true;

        currentLevel.push(root);

        while(!currentLevel.isEmpty()){
            Node node = currentLevel.pop();
            System.out.print(node.data+" ");

            if(leftToRight){
                if(node.left!=null) {
                    nextLevel.push(node.left);
                }
                if(node.right!=null) {
                    nextLevel.push(node.right);
                }
            }
            else{
                if(node.right!=null) {
                    nextLevel.push(node.right);
                }
                if(node.left!=null) {
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

    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }
}
