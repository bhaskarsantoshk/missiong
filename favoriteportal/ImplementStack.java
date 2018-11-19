package missiong.favoriteportal;

import java.util.Scanner;

public class ImplementStack {
    static Node head = null;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t!=0){
            String s= in.nextLine();
            String str[] = s.split(" ");
            if(str[0].equals("push")) {
                Node newNode = new Node(Integer.parseInt(str[1]));
                if (head == null){
                    head=newNode;
                    head.prev=null;
                }
                else{
                    head.next=newNode;
                    Node temp=head;
                    head= head.next;
                    head.prev=temp;
                }
            }

            else{
                if(head==null){
                    System.out.println("Empty");
                }
                else{
                    System.out.println(head.data);
                    Node temp = head.prev;
                    if(head.prev!=null) {
                        head.prev.next = null;
                    }
                    head= temp;
                }
            }
            t--;
        }
    }

    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int val){
            this.data = val;
        }
    }


}

