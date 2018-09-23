package codeforces;

import java.util.Scanner;

public class LittleCLoves3I {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        if ((n-2)%3 !=0){
            System.out.println("1 1 "+(n-2));
        }
        else{
            System.out.println("1 2 "+(n-3));
        }

    }
}
