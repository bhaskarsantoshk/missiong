package leetcode;

public class P206ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
       if ( head == null || head.next == null ){
           return head;
       }
       ListNode newHead = null;
       while ( head != null ){
           ListNode next = head.next;
           head.next = newHead;
           newHead = head;
           head = next;
        }

        return  newHead;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
}
