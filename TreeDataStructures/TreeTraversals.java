package missiong.TreeDataStructures;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversals {
    public void preOrder(BinaryTreeNode root) {
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public ArrayList<Integer> preOrderIterative(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode temp = stack.pop();
            result.add(temp.data);
            if (temp.left != null) {
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }
        return result;
    }

    public void inOrder(BinaryTreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public ArrayList<Integer> inOrderIterative(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode currentNode = root;
        boolean isTraversalCompleted = false;
        while (!isTraversalCompleted) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                if (stack.isEmpty()) {
                    isTraversalCompleted = true;
                } else {
                    currentNode = stack.pop();
                    result.add(currentNode.data);
                    currentNode = currentNode.right;
                }
            }
        }
        return result;
    }

    public void postOrder(BinaryTreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

    public ArrayList<Integer> postOrderIterative(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        BinaryTreeNode prev = null;
        while (!stack.isEmpty()) {
            BinaryTreeNode current = stack.peek();
            if (prev == null || prev.left == current || prev.right == current) {
                // Traverse from top to bottom , and if current has left or right child,
                // push into the stack; else pop out
                if (current.left != null) {
                    stack.push(current.left);
                } else if (current.right != null) {
                    stack.push(current.right);
                }
            } else if (current.left == prev) {
                if (current.right != null) {
                    stack.push(current.right);
                }
            } else {
                result.add(current.data);
                stack.pop();
            }
            prev = current;
        }
        return result;
    }

    public ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return result;
        }
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        ArrayList<Integer> current = new ArrayList<>();
        while (!q.isEmpty()) {
            BinaryTreeNode temp = q.poll();
            if (temp != null) {
                current.add(temp.data);
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            } else {
                ArrayList<Integer> c_curr = new ArrayList<>();
                result.add(c_curr);
                current.clear();
                if (!q.isEmpty()) {
                    q.offer(null);
                }
            }
        }
        return result;

    }
}
