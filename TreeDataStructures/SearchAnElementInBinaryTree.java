package missiong.TreeDataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class SearchAnElementInBinaryTree {
    public static boolean findInBinaryTree(BinaryTreeNode root, int data){
        if(root == null ){
            return false;
        }
        if(root.getData() == data){
            return true;
        }
        return findInBinaryTree(root.left,data) || findInBinaryTree(root.right, data);
    }

    public static boolean findInBinaryTreeLevelOrder(BinaryTreeNode root, int data){
        if(root == null){
            return false;
        }
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            BinaryTreeNode temp = q.poll();
            if(temp.getData() == data){
                return true;
            }

            if(temp!=null){
                if(temp.getLeft() !=null){
                    q.offer(temp.getLeft());
                }
                if(temp.getRight() !=null){
                    q.offer(temp.getRight());
                }
            }
        }
        return false;
    }
}
