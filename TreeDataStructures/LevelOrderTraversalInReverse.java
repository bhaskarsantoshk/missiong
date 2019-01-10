package missiong.TreeDataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversalInReverse {
    public static void levelOrderTraversalInReverse(BinaryTreeNode root){
        if (root == null ){
            return;
        }
        Stack<BinaryTreeNode> s = new Stack<>();
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            BinaryTreeNode temp = q.poll();
            if(temp.getLeft() != null ){
                q.offer(temp.getLeft());
            }
            if(temp.getRight() != null ){
                q.offer(temp.getRight());
            }
            s.push(temp);
        }
        while (!s.isEmpty()){
            System.out.println(s.pop().getData()+" ");
        }
    }
}
