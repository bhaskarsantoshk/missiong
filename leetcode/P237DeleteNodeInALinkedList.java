package leetcode;

public class P237DeleteNodeInALinkedList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode temp= head;
        for(int i=0;i<10;i++){
            temp.next = new ListNode(i+2);
            temp=temp.next;
        }
        temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

        P237DeleteNodeInALinkedList obj = new P237DeleteNodeInALinkedList();
        obj.deleteNode(head);
        temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }

    public void deleteNode(ListNode node) {
        if(node.next==null){
            node = null;
        }
        node.val= node.next.val;
        node.next= node.next.next;
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode (int x){
            this.val= x;
        }
    }
}
