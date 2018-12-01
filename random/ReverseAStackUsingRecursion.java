package missiong.random;

import java.util.Stack;

public class ReverseAStackUsingRecursion {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args){
        createAStack(stack);
        System.out.println(stack);
        reverseAStack();
        System.out.println(stack);
    }

    private static void reverseAStack() {
        if(!stack.isEmpty()){
            int x = stack.pop();
            reverseAStack();
            pushToStack(x);
        }
    }

    private static void pushToStack(int x) {
        if(stack.isEmpty()){
            stack.push(x);
        }
        else{
            int y = stack.pop();
            pushToStack(x);
            stack.push(y);
        }
    }

    private static void createAStack(Stack<Integer> stack) {
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
    }

    //reverse a Stack
}
