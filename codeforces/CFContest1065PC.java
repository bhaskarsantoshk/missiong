package codeforces;

import java.util.Scanner;

public class CFContest1065PC {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int k=in.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++){
           a[i] =in.nextInt();
        }

        int min=Integer.MAX_VALUE;

        int b[] = new int[n];

        for(int i: a){
            min=Math.min(min,i);
        }

        long sum=0;

        for (int i=0;i<n;i++){
            b[i]= a[i]-min;
            sum+=b[i];
        }



    }
}
