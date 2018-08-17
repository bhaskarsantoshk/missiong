package leetcode;

public class P19RemoveNthNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }

        ListNode fast= head;
        ListNode slow= head;

        for(int i = 0 ; i < n ; i++) {
            if(fast!= null ) {
                fast = fast.next;
            }
        }

        // If fast is null, which means 1st node need to be removed
        if( fast == null ){
            head = head.next;
            return head;
        }

        while( fast.next != null ){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next= slow.next.next;

        return head;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode (int x ){
            val = x ;
        }
    }

    public static void main(String[] args){

        ListNode head= null;
        head = new ListNode(1);
        head.next= new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        removeNthFromEnd(head,2);

    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */