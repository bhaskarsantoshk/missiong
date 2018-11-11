package codeforces;
import java.util.*;

public class CFContest1065PB {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int m=in.nextInt();
        int min= (n-2*m) >=0 ? (n- 2*m): 0;
        int max=0;
        if(m<= 2 && m>0){
            max = n-m-1;
        }

        else if(m>2){
            max = n-m;
        }

        else{
            max=n;
        }
        System.out.println(min+" "+max);

    }
}