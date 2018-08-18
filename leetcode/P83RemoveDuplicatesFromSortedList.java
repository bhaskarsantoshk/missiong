package leetcode;

import java.util.List;

public class P83RemoveDuplicatesFromSortedList {
    public static ListNode head = null;

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur= head;
        while ( cur != null ){
            ListNode temp= cur.next;
            while(temp != null && temp.val== cur.val){
                temp = temp.next;
            }
            cur.next = temp;
            cur = cur.next;
        }

        return head;
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
        head.next=new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        P83RemoveDuplicatesFromSortedList obj = new P83RemoveDuplicatesFromSortedList();
        ListNode temp = obj.deleteDuplicates(head);

        printLinkedList(temp);
    }

    public  static void printLinkedList(ListNode head){
        ListNode cur= head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }
}
