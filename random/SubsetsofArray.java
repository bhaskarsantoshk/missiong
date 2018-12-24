package missiong.random;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class SubSetsofArray {
    static Scanner in = new Scanner(System.in);
    static int ans = 0;

    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            printSubsets();
        }
    }

    static public void printSubsets() {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        
    int[] b= a;
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            for (int l = 1; l < b.length; l++) {
                for (int j = 1; j <= (b.length - l - i); j++) {
                    System.out.print(b[i] + " ");
                    for (int k = i + l; k < (i + j + l); k++) {
                        System.out.print(b[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

}