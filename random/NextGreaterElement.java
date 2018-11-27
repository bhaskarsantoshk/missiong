package missiong.random;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args){
        int a[]= {1,2,3,4,5};
        int b[]= {5,4,3,2,1};
        int c[]= {2,3,1,4,5};
        nextGreaterElements(a);
        nextGreaterElements(b);
        nextGreaterElements(c);
    }
    private static void nextGreaterElements(int[] a) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(a[0]);
        for(int i=1;i<a.length;i++){
            if(a[i] > stack.peek()){
                System.out.print(a[i]+" ");
                stack.pop();
                stack.push(a[i]);
            }
            else {
                while (stack.isEmpty() || stack.peek() <= a[i]) {
                    stack.push(a[i]);
                }
            }
        }
        System.out.println();

    }
}
