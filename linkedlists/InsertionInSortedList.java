package linkedlists;

public class InsertionInSortedList {
    static Node head=null;
    public static void main (String[] args){
        head= new Node(1);
        head.next= new Node(3);
        head.next.next = new Node(7);
        head.next.next.next= new Node(16);

        InsertionInSortedList obj = new InsertionInSortedList();
        obj.sortedInsert(8);
        printList(head);
        obj.sortedInsert(0);
        printList(head);
        obj.sortedInsert(1);
        printList(head);
        obj.sortedInsert(100);
        printList(head);
    }

    public static void printList(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void sortedInsert(int val){
        Node newNode = new Node(val);
        Node current;
        if(head==null || head.data >= val){
            newNode.next=head;
            head= newNode;
        }
        else{
            current =head;

            while(current.next!=null && current.next.data < val){
                current=current.next;
            }
            newNode.next=current.next;
            current.next= newNode;
        }

    }
}
