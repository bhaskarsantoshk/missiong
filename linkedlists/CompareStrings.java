package linkedlists;

public class CompareStrings {
    static Node a,b;
    public static void main(String[] args) {

        CompareStrings list = new CompareStrings();
        Node result = null;

        list.a = new Node('g');
        list.a.next = new Node('e');
        list.a.next.next = new Node('e');
        list.a.next.next.next = new Node('k');
        list.a.next.next.next.next = new Node('s');
        list.a.next.next.next.next.next = new Node('b');

        list.b = new Node('g');
        list.b.next = new Node('e');
        list.b.next.next = new Node('e');
        list.b.next.next.next = new Node('k');
        list.b.next.next.next.next = new Node('s');
        list.b.next.next.next.next.next = new Node('a');

        int value;
        value = list.compare(a, b);
        System.out.println(value);

    }

    public static int compare(Node a, Node b){
        if(a==null && b==null){
            return  1;
        }

        while(a!=null && b!=null && a.data==b.data){
            a=a.next;
            b=b.next;
        }

        if(a!=null && b!=null ){
            return  (a.data > b.data)?1:-1;
        }

        if(a!=null && b==null){
            return 1;
        }

        if(b!=null ){
            return -1;
        }

        return 0;
    }
}
