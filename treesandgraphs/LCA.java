package missiong.treesandgraphs;

public class LCA {
    static Node root = null;
    public static void main(String[] args){
        Node root= new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(lca(root,root.left.left, root.right.left).data);
    }

    private static Node lca(Node root, Node N1, Node N2) {
        if(root==null){
            return null;
        }
        if(root==N1 || root==N2){
            return root;
        }
        Node left = lca(root.left, N1,N2);
        Node right = lca(root.right, N1,N2);
        if(left!=null && right!=null){
            return root;
        }
        if(left==null && right==null){
            return null;
        }

        return left!=null ? left:right;

    }

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
}
