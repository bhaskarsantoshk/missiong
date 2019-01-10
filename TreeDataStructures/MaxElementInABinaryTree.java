package missiong.TreeDataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElementInABinaryTree {
    public int maxInBinaryTree(BinaryTreeNode root){
        int maxValue = Integer.MIN_VALUE;
        if(root!=null){
            int leftMax = maxInBinaryTree(root.left);
            int rightMax = maxInBinaryTree(root.right);
            if(leftMax > rightMax){
                maxValue = leftMax;
            }
            else{
                maxValue = rightMax;
            }
            if(root.data > maxValue){
                maxValue = root.data;
            }
        }
        return maxValue;
    }

    public int maxInBinaryTreeLevelOrder(BinaryTreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);

        while(!q.isEmpty()){
            BinaryTreeNode temp = q.poll();
            if(temp.data > max){
                max = temp.data;
            }
            if(temp!=null){
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
        }
        return max;

    }
}