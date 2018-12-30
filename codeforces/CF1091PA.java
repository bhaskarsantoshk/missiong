package missiong.codeforces;

import java.util.Scanner;

public class CF1091PA {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int yellow = in.nextInt();
        int blue = in.nextInt();
        int red= in.nextInt();

        int total =0;
        int max =0;
        while(true){
            if(yellow+1 == blue && blue+1==red){
                break;
            }
            max = Math.max(yellow, Math.max(blue, red));

            if( max == red){
                if(red-blue >=2){
                    red--;
                }
                if(blue - yellow > 1){
                    blue--;
                }

                if(blue == yellow){
                    yellow--;
                }
            }
            if(max == blue){
                if(blue>=red){
                    blue--;
                }
                else if(    blue - yellow >2){
                    blue--;
                }
            }

            if(max==yellow){
                yellow--;
            }
        }

        System.out.println(blue+yellow+red);
    }
}
