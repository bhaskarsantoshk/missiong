package leetcode;

public class P160IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0;
        int lenB=0;

        ListNode cur1 = headA;
        while(cur1 != null ){
            lenA++;
            cur1 = cur1.next;
        }

        ListNode cur2 = headB;
        while(cur2 != null ){
            lenB++;
            cur2 = cur2.next;
        }
        int diff = Math.abs(lenA-lenB);
        if(lenA>lenB){
            return intersection(headA, headB, diff) ;
        }
        else{
            return intersection(headB, headA, diff) ;
        }

    }

    static ListNode intersection(ListNode node1, ListNode node2, int diff){
        while (diff!=0){
            node1 = node1.next;
            diff--;
        }

        while(node1 != node2){
            node1 = node1.next;
            node2 = node2.next;
        }

        return node1;
    }

    class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val =x;
            next=null;
        }
    }
}
