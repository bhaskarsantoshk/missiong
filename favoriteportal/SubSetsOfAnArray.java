package favoriteportal;

import java.util.Arrays;
import java.util.Scanner;

public class SubSetsOfAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t!=0){
            int n=in.nextInt();
            int a[]= new int[n];

            for (int i=0;i<n;i++){
                a[i]=in.nextInt();
            }

            Arrays.sort(a);

            printPowerSet(a,0,0, n);



            t--;
        }
    }

    private static void printPowerSet(int[] a, int i, int j, int n) {
        
    }


}
