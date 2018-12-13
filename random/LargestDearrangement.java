package missiong.random;

import java.util.Arrays;
import java.util.Collections;


public class LargestDearrangement {
    public static void main(String[] args){
        Integer seq[] = {5, 4, 3, 2, 1};
        Integer seq2[]= {56, 21, 42, 67, 23, 74};
       // Integer[] result = largestDearrangement(seq, seq.length);
        Integer[] result2 = largestDearrangement(seq2, seq2.length);
       // printArray(result);
        System.out.println();
        printArray(result2);
    }

    public static void printArray(Integer[] seq){
        for(Integer i: seq){
            System.out.print(i+" ");
        }
    }

    private static Integer[] largestDearrangement(Integer[] seq, int length) {
        Integer[] temp = Arrays.copyOf(seq, length);
        Arrays.sort(temp, Collections.reverseOrder());
        if(temp[0]==seq[0]){
            swap(temp, 0,1);
        }
        for (int i=1;i<length-1;i++){
            System.out.println(temp[i]+" "+seq[i]);
            if(temp[i]==seq[i]){
                swap(temp,i, i+1);
            }
        }

        if(temp[length-1]==seq[length-1]){
            swap(temp, length-2, length-1);
        }

        return temp;
    }

    private static void swap(Integer[] temp, int i, int j) {
        int t = temp[i];
        temp[i] = temp[j];
        temp[j]= t;

    }
}
