package missiong.random;

public class RemoveAllTheOccurencesOfAGivenKeyFromDoublyLinkedList {
    static LinkedListNode head = null;
    public static void main(String[] args){
        constructLinkedList(head);
    }

    private static void constructLinkedList(LinkedListNode head) {
        head = new LinkedListNode(2);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(10);
        head.next.next.next = new LinkedListNode(8);
        head.next.next.next.next = new LinkedListNode(4);
        head.next.next.next.next.next = new LinkedListNode(2);
        head.next.next.next.next.next.next = new LinkedListNode(5);
        head.next.next.next.next.next.next.next = new LinkedListNode(2);
        LinkedListNode temp = head;
        
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
