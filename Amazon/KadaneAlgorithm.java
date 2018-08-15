package Amazon;
/*
Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.
*/

import java.util.Scanner;

public class KadaneAlgorithm {

    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        while(t!=0){
            int n = in.nextInt();
            int a[]= new int[n];
            for(int i = 0; i < n ; i++ ){
                a[i] = in.nextInt();
            }
            maximumContigiousSum(a,n);
            t--;
        }
    }

    static void maximumContigiousSum(int[] a, int n){
        int localMaxSum = a[0];
        int globalMaxSum = a[0];

        for(int i = 1; i < n ; i++){
            localMaxSum= Math.max(localMaxSum+a[i], a[i]);
            globalMaxSum = Math.max(localMaxSum,globalMaxSum);
        }

        System.out.println(globalMaxSum);
    }
}
