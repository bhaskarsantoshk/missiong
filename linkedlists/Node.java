package linkedlists;

public class Node {
    Node next=null;
    int data;
    public Node(int d){
        data=d;
    }
    Node(char d) {
        data = d;
        next = null;
    }
    public Node(){

    }
    void appendToTail(int d){
        Node end= new Node(d);
        Node n=this;
        while(n.next!=null){
            n=n.next;
        }
        n.next=end;
    }
}
