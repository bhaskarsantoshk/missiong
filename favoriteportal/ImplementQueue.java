package missiong.favoriteportal;

import java.util.Scanner;

public class ImplementQueue {
    static Node head = null;

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Node tail = null;

        int t=in.nextInt();
        in.nextLine();
        while (t!=0){
            String s= in.nextLine();
            String str[] = s.split(" ");
            if(str[0].equals("Enqueue")){
                Node newNode = new Node(Integer.parseInt(str[1]));
                if(head==null){
                    head = newNode;
                    tail=head;
                }
                else{
                    tail.next=newNode;
                    tail= tail.next;
                }
            }
            else{
                if(head == null ){
                    System.out.println("Empty");
                }
                else{
                    System.out.println(head.data);
                    head = head.next;
                }
            }
            t--;
        }
    }


    static class Node{
        int data;
        Node next;

        Node(int val){
            this.data=val;
        }
    }
}
