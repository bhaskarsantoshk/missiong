package com.ctci.linkedlists;

public class LoopDetection extends Node{
    static Node head=new Node();
    public static void main(String args[]){

        head.data=1;
        head.next=new Node(2);
        //head.next.data=2;
        head.next.next=new Node(3);;
        head.next.next.next=new Node(4);;
        head.next.next.next.next=head.next.next;
      // System.out.println(head.next.next.next.next.equals(head.next.next));
       System.out.println(loopDetection(head));

    }

    static Node loopDetection(Node head){
        Node n=head;
        boolean isCycleExist=false;
        boolean loopend=false;
        Node slowPointer=head;
        Node fastPointer=head;

        while(slowPointer.next!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next;
            if(fastPointer.next!=null){
                fastPointer=fastPointer.next;
            }else{
                loopend=true;
            }

            if(slowPointer.equals(fastPointer) && loopend==false){
                isCycleExist=true;
                break;
            }


        }

        while(n.next!=null && slowPointer.next!=null){
            if(n.equals(slowPointer)){
                System.out.println(slowPointer.data);
                return n;
            }
            n=n.next;
            slowPointer=slowPointer.next;
        }
        return null;
    }
}
