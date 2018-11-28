package missiong.favoriteportal;

import java.util.Scanner;

public class Interleavings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t!=0){
            String s= in.nextLine();

            String[] str= s.split(" ");
            Interleavings obj= new Interleavings();
            obj.printInterleavings(str[0], str[1]);
            t--;
        }
    }
    private void printInterleavings(String s, String t) {
        // bn zh
        //bnzh, bzhn, bznh, zbhn, zbnh, zhbn
        //0 1 2 3 4 5 6 7 8 9
        //a b c d e f g h i j
    }
}
