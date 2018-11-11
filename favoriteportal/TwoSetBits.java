package favoriteportal;

import java.util.Scanner;

public class TwoSetBits {

    static int powerOfTwo[]= new int[200];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
        int result[]= new int[100001];

        for(int i=0;i<powerOfTwo.length;i++){
            powerOfTwo[i]= powOfTwo(2,i);
            System.out.println(powerOfTwo[i]);
        }

        System.out.println(powerOfTwo[100]);
        int x=1;


    }

    static int powOfTwo(int x, int i){
        if(powerOfTwo[i]!=0){
            return powerOfTwo[i];
        }

        else{
            int temp= powOfTwo(2, i/2);
            if (i%2==0){
                return ( (temp % 1000000007) * (temp % 1000000007) )%1000000007;
            }
            else{
                return ( (((temp % 1000000007) * (temp % 1000000007) )%1000000007) * 2)% 1000000007;
            }
        }
    }
}
