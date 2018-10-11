package treesandgraphs;

public class MinDepthOfABinaryTree {

    Node root;
        public int minDepthOfAbinartTree(Node root){
            if(root==null){
                return 0;
            }

            if(root.left==null && root.right==null){
                return 1;
            }

                int left = minDepthOfAbinartTree(root.left);

                int right = minDepthOfAbinartTree(root.right);

            return Math.min(left,right)+1;
        }


    public static void main(String args[])
    {
        MinDepthOfABinaryTree tree = new MinDepthOfABinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The minimum depth of "+
                "binary tree is : " + tree.minDepthOfAbinartTree(tree.root));
    }
}
