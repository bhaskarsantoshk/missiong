package leetcode;

public class P707DesignLinkedList {
    public static int length;
    public static Node head;

    class Node{
        int val;
        Node next;
        Node prev;

        Node(int x){
            this.val=x;
        }
    }

    public P707DesignLinkedList() {
            this.length = 0;
            this.head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= this.length){
            return -1;
        }
        Node cur= this.head;
        for(int i=0; i<index ; i++){
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    Node newHead = new Node(val);
    newHead.next = this.head;
    newHead.prev = null;
    this.head = newHead;
    this.length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(this.length == 0 ){
            addAtHead(val);
            return;
        }
        Node cur = this.head;
        Node newNode = new Node(val);
        while(cur.next != null ){
            cur = cur.next;
        }
        newNode.prev= cur;
        cur.next = newNode;
        this.length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index<0 || index>this.length){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == this.length){
            addAtTail(val);
            return;
        }
        Node newNode = new Node(val);
        Node cur= this.head;
        for(int i = 0; i < index-1 ; i++){
            cur = cur.next;
        }
        Node pre = cur;
        Node next = cur.next;
        newNode.next = next;
        newNode.prev = pre;
        pre.next = newNode;
        if( next != null ){
            next.prev = newNode;
        }
        this.length++;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    if(index < 0 || index >= this.length){
        return;
    }
    Node cur = this.head;
    if ( index == 0 ){
        this.head = cur.next ;
    }
    else {
        for(int i = 0 ; i < index-1 ; i++ ){
            cur = cur.next;
        }
        Node pre = cur;
        Node next = cur.next.next;
        pre.next = next;

        if(next!=null){
            next.prev= pre;
        }
    }

    this.length--;


    }
}
