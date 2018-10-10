package linkedlists;

public class DeletingANode extends Node {
    Node deleteNode(Node head, int d){
        Node n=head;
        if(n.data==d) return head.next;
        while(n.next!=null){
            if(n.next.data==d){
                n.next=n.next.next;
                return head;
            }
            n=n.next;
        }
        return head;
    }
}
