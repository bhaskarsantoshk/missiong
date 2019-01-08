package missiong.TreeDataStructures;

public class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left, right;

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public BinaryTreeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }
    public int getData(){
        return data;
    }
}
