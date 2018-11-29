package missiong.random;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumElementInEveryContigiuousSubArray {
    public static void main(String[] args){
        int [] a = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k= 3;
        printMaxInEverySubArray(a,k);
    }

    private static void printMaxInEverySubArray(int[] a, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int i=0;
        // First window , I will push to queue from rear end when the stack is empty, if it's not empty,
        // I will remove elements that are less than the current element since they are not required for this as well as next window
        //I will add the elements that are less than the last element
        for(i=0; i<k;i++){
            while (dq.isEmpty() == false && a[i] >= a[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        while ( i < a.length) {
            //Printing the first element of the Dequeue since there is no bigger number than this currently
            System.out.print(a[dq.peekFirst()] +" ");
            // Now while adding new elements into window, first thing I do is removing the out of window elements
            while (dq.isEmpty() == false && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            //Now again I will remove Dequeue elements from last if there comes new number that is greater
            //
            while (dq.isEmpty() == false && a[i] >= a[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);

            i++;
        }
        //At last I will print the first element of the last window
        System.out.println(a[dq.peekFirst()]);
    }


}
