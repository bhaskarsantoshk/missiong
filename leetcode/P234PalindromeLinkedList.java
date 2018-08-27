package leetcode;
import java.util.Stack;

public class P234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode fast = head;
        ListNode slow = head;
        if(head == null || head.next == null ){
            return true;
        }

        while(fast != null && fast.next != null ){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null ){
            slow = slow.next;
        }


        while ( !stack.isEmpty() && slow != null ){
            if(stack.pop() != slow.val){
                return false;
            }
            slow = slow.next;
        }

        return true;
    }


    class ListNode{
        int val;
        ListNode next;
        ListNode( int x ){
            this.val = x;
        }
    }
}
