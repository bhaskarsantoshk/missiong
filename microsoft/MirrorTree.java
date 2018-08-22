package microsoft;
import java.util.Scanner;
import java.util.HashMap;

public class MirrorTree {
    class Node
    {
        int data;
        Node left, right;
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    void mirror(Node node)
    {
        if( node == null ){
            return;
        }
        mirror(node.left);
        mirror(node.right);

        Node temp=node.left;
        node.left = node.right;
        node.right = temp;
    }

}
