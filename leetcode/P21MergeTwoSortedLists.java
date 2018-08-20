package leetcode;

public class P21MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l3= dummyHead;

        while( l1 != null && l2 != null ){
            if( l1.val < l2.val ){
                l3.next = l1;
                l1 = l1.next;
            }
            else{
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }

        if ( l1 != null){
            l3.next = l1;
        }

        if( l2 != null ){
            l3.next = l2;
        }

        return dummyHead.next;
    }

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int data){
            this.val = data;
            this.next = null;
        }
    }

    public static void main(String [] args){
        ListNode l1= new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2= new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        P21MergeTwoSortedLists obj = new P21MergeTwoSortedLists();
        ListNode l3= obj.mergeTwoLists(l1,l2);

        printLinkedList(l3);
    }

    public static void printLinkedList(ListNode l){
        ListNode cur =l;
        while( cur != null ){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }
}
