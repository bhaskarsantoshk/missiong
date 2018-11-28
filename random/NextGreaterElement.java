package missiong.random;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args){
        int a[]= {1,2,3,4,5};
        int b[]= {5,4,3,2,1};
        int c[]= {2,3,1,4,5};
        int d[]= {5,2,3,4,5,5,2,3,4,5,5,2,3,4,5,5,2,3,4,5,5,2,3,4,5,5,2,3,4,5};
//        nextGreaterElements(a);
//        nextGreaterElements(b);
//        nextGreaterElements(c);
        nextGreaterElements(d);
    }
    private static void nextGreaterElements(int[] a) {
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[a.length];
        for (int i=a.length-1;i >=0 ; i--){
            while (stack.isEmpty()==false && a[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]= -1;
            }
            else{
                result[i]= stack.peek();
            }
            stack.push(a[i]);
            System.out.println(stack);
        }
        printArray(result);
        System.out.println();
    }

    static void printArray( int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
