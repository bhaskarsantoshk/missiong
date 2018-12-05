package missiong.random;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SecondHalfInterleavesFirstHalfInQueue {
    static Queue<Integer> queue = null;
    public static void main(String[] args){
        queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        secondHalfInterleavesFirstHalfInQueue(queue);
    }

    private static void secondHalfInterleavesFirstHalfInQueue(Queue<Integer> queue) {
        // 1 2 3 4
        // Queue: 3 4 StacK: 1 2
        //Queue: 3 4 2 1
        //Queue: 2 1 3 4
        //StacK: 2 1 Queue: 3 4
        //Now while stack is empty: push stack top to queue and queue's front to queue again
        Stack<Integer> stack = new Stack<>();
        int size = queue.size();
        System.out.println(queue);
        for(int i=0; i<size/2 ; i++){
            int number = queue.poll();
            stack.push(number);
        }
        //System.out.println(stack);
        //System.out.println(queue);
        while(!stack.isEmpty()){
            int number = stack.pop();
            queue.add(number);
        }
        //System.out.println(queue);
        for(int i=0;i<size/2;i++){
            int number = queue.poll();
            queue.add(number);
        }
        //System.out.println(queue);
        for(int i=0; i<size/2 ; i++){
            int number = queue.poll();
            stack.push(number);
        }
        while (!stack.isEmpty()){
            int number = stack.pop();
            queue.add(number);
            number = queue.poll();
            queue.add(number);
        }
        System.out.println(queue);

    }
}
