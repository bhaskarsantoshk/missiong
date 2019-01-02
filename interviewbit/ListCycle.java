package missiong.interviewbit;

public class ListCycle {
    public static void main(String[] args){
            ListNode node = new ListNode(1);
            node.next = new ListNode(2);
            node.next.next = new ListNode(3);
            ListNode result = detectCycle(node);
            if(result!=null) {
                System.out.println(result.val);
            }
            else{
                System.out.println("No Cycle");
            }
    }
    static class ListNode{
        public int val;
        public ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public static ListNode detectCycle(ListNode a){
     ListNode slow = a;
     ListNode fast = a;
     boolean hasCycle = false;

     while(slow!=null && fast!=null && fast.next!=null){
         slow= slow.next;
         fast = fast.next.next;
         if(slow==fast){
             hasCycle = true;
             break;
         }
     }

     if(!hasCycle){
         return null;
     }

     while(slow!=fast){
         slow = slow.next;
         fast = fast.next;
     }

        return fast;
    }
}
