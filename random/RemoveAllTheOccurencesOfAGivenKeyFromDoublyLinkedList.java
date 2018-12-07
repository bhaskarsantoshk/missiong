package missiong.random;

public class RemoveAllTheOccurencesOfAGivenKeyFromDoublyLinkedList {
    static LinkedListNode head = null;
    public static void main(String[] args){
        constructLinkedList();
        //printLinkedList(head);
        deleteAllOccurences(head, 2);
       // printLinkedList(head);
    }
    private static void deleteAllOccurences(LinkedListNode head, int key) {
        if(head == null){
            return;
        }
        LinkedListNode cur = head;
        LinkedListNode next;
        while (cur!= null){
            //System.out.print(cur.data+" ");
            if(cur.data == key){
                next = cur.next;
                deleteNode (head , cur);
                cur = next;
            }
            else{
                cur = cur.next;
            }
        }
    }

    private static void deleteNode(LinkedListNode head, LinkedListNode cur) {
        if(head == null || cur== null){
            return;
        }
        if(head == cur){
            head = cur.next;
        }
        if(cur.next!=null){
            cur.next.prev = cur.prev;
        }
        if(cur.prev !=null){
            cur.prev.next = cur.next;
        }

        cur = null;
    }

    private static void printLinkedList(LinkedListNode head) {
        System.out.println("Forward :");
        LinkedListNode temp = head;
        LinkedListNode lastNode = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            lastNode = temp;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Reverse :");
        while(lastNode!=null){
            System.out.print(lastNode.data+" ");
            lastNode = lastNode.prev;
        }
    }
    private static void constructLinkedList() {
        head = new LinkedListNode(2);
        head.prev = null;
        head.next = new LinkedListNode(2);
        head.next.prev = head;
        head.next.next = new LinkedListNode(10);
        head.next.next.prev = head.next;
        head.next.next.next = new LinkedListNode(8);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new LinkedListNode(4);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new LinkedListNode(2);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new LinkedListNode(5);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;
        head.next.next.next.next.next.next.next = new LinkedListNode(2);
        head.next.next.next.next.next.next.next.prev = head.next.next.next.next.next.next;
    }
    static class LinkedListNode{
        int data;
        LinkedListNode prev;
        LinkedListNode next;

        LinkedListNode(int val){
            this.data = val;
        }
    }
}
