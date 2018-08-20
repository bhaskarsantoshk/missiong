package leetcode;

import javax.swing.*;
import java.util.List;

public class P203RemoveLinkedListElements {
    public static ListNode head;

    public ListNode removeElementsRecursive(ListNode head, int val) {
        if(head == null ) {
            return null;
        }
        head.next = removeElements(head.next ,val);
        return head.val == val ? head.next : head;
    }

    public ListNode removeElements(ListNode head, int val){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        ListNode prev= dummy;

        while( cur != null ){
            if(cur.val==val){
                prev.next = cur.next;
            }
            else{
                prev= prev.next;
            }

            cur = cur.next;
        }
        return dummy.next;

    }

   static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args){
        head= new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode( 3);
        head.next.next.next.next = new ListNode( 4);
        head.next.next.next.next.next =  new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        P203RemoveLinkedListElements obj= new P203RemoveLinkedListElements();
        ListNode temp = obj.removeElements(head, 6);

        printLinkedList(temp);
    }

    public static void printLinkedList(ListNode head){
        ListNode cur = head;
        while(cur != null ){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }
}
