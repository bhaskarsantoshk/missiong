package missiong.random;

import java.util.LinkedList;
import java.util.Queue;

public class BSTfromLinkedList {
    static LinkedListNode head = null;
    static TreeNode root = null;
    public static void main(String[] args){
        constructLinkedList();
        constructBST(head);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);

    }

    private static void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }

    private static void postOrder(TreeNode root) {
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    private static void inOrder(TreeNode root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    private static void preOrder(TreeNode root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void constructLinkedList() {
        head = new LinkedListNode(8);
        head.next = new LinkedListNode(3);
        head.next.next = new LinkedListNode(10);
        head.next.next.next = new LinkedListNode(1);
        head.next.next.next.next = new LinkedListNode(6);
        head.next.next.next.next.next = new LinkedListNode(4);
        head.next.next.next.next.next.next = new LinkedListNode(7);
        head.next.next.next.next.next.next.next = new LinkedListNode(14);
        head.next.next.next.next.next.next.next.next = new LinkedListNode(13);
    }

    public static TreeNode constructBST(LinkedListNode head){
        LinkedListNode pointer = head;
        while (pointer !=null ){
            root = insert(root, pointer.data);
            pointer = pointer.next;
        }
        return root;
    }

    private static TreeNode insert(TreeNode root, int data) {
        if(root == null){
            root = new TreeNode(data);
        }
        else if(root.data <= data){
            root.right = insert(root.right, data);
        }
        else{
            root.left = insert(root.left, data);
        }

        return root;
    }

    static class LinkedListNode{
        int data;
        LinkedListNode prev;
        LinkedListNode next;

        LinkedListNode (int data){
            this.data = data;
        }
    }

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode (int val){
            this.data = val;
        }
    }
}
