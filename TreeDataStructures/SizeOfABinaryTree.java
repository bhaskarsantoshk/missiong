package missiong.TreeDataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfABinaryTree {
    public int size(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = (root.left == null) ? 0 : size(root.left);
        int rightCount = (root.right == null) ? 0 : size(root.right);
        return 1 + leftCount + rightCount;
    }
    public int sizeIterative(BinaryTreeNode root) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            BinaryTreeNode temp = q.poll();
            count++;
            if (temp.getRight() != null) {
                q.offer(temp.getLeft());
            }
            if (temp.getRight() != null) {
                q.offer(temp.getRight());
            }
        }
        return count;
    }
}
