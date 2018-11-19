package missiong.favoriteportal;

//package missiong.favoriteportal;

import java.util.Scanner;

public class ImplementDeQue {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node (int val){
            this.data= val;
        }
    }


    static Node head = null;
    static Node tail = null;

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while (t!=0){
            String s= in.nextLine();
            String str[] = s.split(" ");
            //System.out.println("Linked List before "+s+" : ");
            //printLinkedList(head);
            if(str[0].equals("push_front")){
                pushFront(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("push_back")){
                pushBack(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("pop_front")){
                popFront();
            }
            else if(str[0].equals("pop_back")){
                popBack();
            }
            // System.out.println("Linked List after "+s+" : ");
            // printLinkedList(head);
            t--;
        }
    }

    private static void popBack(){
        if(tail == null){
            System.out.println("Empty");
        }
        else{

            System.out.println(tail.data);
            if(tail.prev==null){
                head = tail= null;
            }
            else {
                tail = tail.prev;
                tail.next = null;
            }
        }

    }

    private static void popFront() {
        if( head == null ){
            System.out.println("Empty");
        }
        else{
            System.out.println(head.data);
            if(head.next==null){
                head = tail= null;
            }
            else {
                head = head.next;
                head.prev=null;
            }
        }
    }

    private static void pushBack(int x) {
        Node newNode = new Node (x);
        if (tail == null){
            tail = head = newNode;
        }
        else{
            tail.next= newNode;
            newNode.prev= tail;
            tail= newNode;
        }
    }

    private static void pushFront(int x) {
        Node newNode = new Node(x);
        if(head == null){
            head = tail= newNode;
        }
        else{
            newNode.next=head;
            head.prev= newNode;
            head= newNode;
        }
    }

    public static void printLinkedList(Node head){
        // System.out.println("---------------------");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println();
        //System.out.println("----------------------");

    }
}
