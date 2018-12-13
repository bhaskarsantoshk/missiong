package missiong.random;

import java.util.Scanner;

public class UglyNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int x= uglyNumber(n);
        System.out.println(x);
    }

    private static int uglyNumber(int n) {
        if(n==1){
            return 1;
        }
        int a[] = new int[n+1];
        a[0] = 1;

        int counter2 = 0;
        int counter3 = 0;
        int counter5 = 0;

        int multiple2 = 2;
        int multiple3 = 3;
        int multiple5 = 5;

        for(int i=1;i<n;i++) {
            int[] minimum = minimumValAndIndex(a, multiple2, multiple3, multiple5, i, counter2, counter3, counter5);
            if(minimum[0]==2){
                counter2++;
            }
            else if(minimum[0]==3){
                counter3++;
            }
            else{
                counter5++;
            }
            a[i]= minimum[1];
        }

        return a[n-1];
    }

    private static int[] minimumValAndIndex(int[] a, int multiple2, int multiple3, int multiple5, int i, int counter2, int counter3, int counter5) {
        int [] result = new int[2];
        int x=0;
        result[1] = Math.min(multiple2*a[i-1]*counter2, multiple3*a[i-1]*counter3);
        if(multiple2*a[i-1]*counter2 < multiple3*a[i-1]*counter3){
            result[0]= 2;
        }
        else{
            result[0] = 3;
        }
        result[1] = Math.min(result[1], multiple5*a[i-1]*counter5);
        if(multiple5*a[i-1]*counter5 < result[1]){
            result[0] = 5;
        }

        return result;
    }
}
