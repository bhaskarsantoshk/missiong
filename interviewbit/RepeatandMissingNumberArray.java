package missiong.interviewbit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatandMissingNumberArray {
    public int[] repeatedNumber(final int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        int res[]= new int[2];
        long sum = 0;
        for(int x: A){
            sum+=x;
            if(set.contains(x)){
                res[0] = x;
            }
            else{
                set.add(x);
            }
        }

        sum= sum - res[0];

        for(int i=1;i<=A.length;i++){
            sum-=i;
        }
        res[1]=Math.abs((int)sum);
       // Arrays.sort(res);
        return res;


    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args){
        int a[] = {3,1,2,5,3};
        printArray(new RepeatandMissingNumberArray().repeatedNumber(a));
    }
}
