package codeforces;

import java.util.Scanner;

public class CFContest1066PA {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();

        while(t!=0){
            int L=in.nextInt();
            int v=in.nextInt();

            int l= in.nextInt();
            int r= in.nextInt();

            long x= v * (l/v) ;
            boolean f=true;
            if (x%v==0 && (l%v)!=0){
                f= false;
            }
            long y= v * (r/v) ;

            long xandy= (y-x)/v;

            long total= L/v;

            long res= total - xandy;
            if(f==true){
                res-=1;
            }

            //System.out.println("x "+x+" y "+y+" xandy "+xandy+" total "+total);

            System.out.println(res);


            t--;
        }
    }
}
