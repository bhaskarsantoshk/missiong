package missiong.TreeDataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class InsertingElementInBinaryTree {
    public BinaryTreeNode insertInBinaryTreeLevelOrder(BinaryTreeNode root, int data) {
        if (root == null) {
            return new BinaryTreeNode(data);
        }
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            BinaryTreeNode temp = q.poll();
            if (temp != null) {
                if (temp.left != null) {
                    q.offer(temp.left);
                } else {
                    temp.left = new BinaryTreeNode(data);
                    return root;
                }

                if (temp.right != null) {
                    q.offer(temp.right);
                } else {
                    temp.right = new BinaryTreeNode(data);
                    return root;
                }
            }
        }
        return root;
    }

    public void insert(BinaryTreeNode root, int data) {
        if (root == null) {
            root = new BinaryTreeNode(data);
        } else {
            insertHelper(root, data);
        }
    }

    private void insertHelper(BinaryTreeNode root, int data) {
        if (root.data >= data) {
            if (root.left == null) {
                root.left = new BinaryTreeNode(data);
            } else {
                insertHelper(root.right, data);
            }
        } else {
            if (root.right == null) {
                root.right = new BinaryTreeNode(data);
            } else {
                insertHelper(root.right, data);
            }
        }
    }
}
