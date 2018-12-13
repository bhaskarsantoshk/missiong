package missiong.random;

public class PriorityQueueImplementation {
    static Node head = null;
    public static void main(String[] args){
        head = new Node(8,1);
        head = push(head, 7, 2);
        head = push(head, 6, 3);
        head = push(head, 5, 5);
        head = push(head, 4, 4);
        head = push(head, 1, 6);

        while (!isEmpty(head)){
            System.out.print(head.data +" ");
            head = pop(head);
        }

    }

    static class Node{
        int data;
        int priority;
        Node next;

        Node (int val, int priority){
            this.data = val;
            this.priority = priority;
        }
    }

    static boolean isEmpty(Node head){
        return head == null;
    }

    static int peek(Node head){
        return head.data;
    }

    static Node pop(Node head){
        Node temp = head;
        head = head.next;
        return  head;
    }

    static Node push(Node head, int data, int priority){
        Node current = head;
        Node temp = new Node(data,priority);

        if(head.priority > priority){
            temp.next = head;
            head = temp;
        }
        else{
            while (current.next!=null && current.next.priority <priority){
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
        }

        return head;
    }
}
