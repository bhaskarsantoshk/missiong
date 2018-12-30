package missiong.treesandgraphs;

public class DistanceBetweenTwoNodesInATree {
    static ZigZagTraversalOfATree.Node root = null;
    public static void main(String[] args){
        ZigZagTraversalOfATree.Node root= new ZigZagTraversalOfATree.Node(1);
        root.left = new ZigZagTraversalOfATree.Node(2);
        root.right = new ZigZagTraversalOfATree.Node(3);
        root.left.left = new ZigZagTraversalOfATree.Node(4);
        root.left.right = new ZigZagTraversalOfATree.Node(5);
        root.right.left = new ZigZagTraversalOfATree.Node(6);
        root.right.right = new ZigZagTraversalOfATree.Node(7);

    }
}
