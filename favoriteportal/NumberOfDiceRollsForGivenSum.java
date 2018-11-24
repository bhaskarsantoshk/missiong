package missiong.favoriteportal;

import java.util.Scanner;

public class NumberOfDiceRollsForGivenSum {
    public static void main (String[] args){
        int a[] = new int[100001];
        // 1 = (1) = 1
        //2 = (1 1), (2) = 2
        //3 = (1 1 1), (1 , 2) , (2, 1), (3) = 4
        //4 = (1,1,1,1), (1, 1, 2), (1, 2, 1), (1,3), (2,1,1), (2 2) , (3,1), (4)=7
        //5

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t!=0){
            int n = in.nextInt();
            t--;
        }

    }
}
