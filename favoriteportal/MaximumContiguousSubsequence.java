package favoriteportal;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumContiguousSubsequence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        while(t!=0){
            int n=in.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }

            Arrays.sort(a);

            System.out.println(maxContiguosSubsequence(a));

            t--;
        }
    }

    public static int maxContiguosSubsequence(int[] a){

        if(a.length==1){
            return 0;
        }

        for(int x:a){
           // System.out.print(x+" ");
        }
        int max=1;
        int res=1;

        for (int i=0;i<a.length-1;i++){
            if(a[i+1]-a[i]==1){
                max++;
            }
            else if(a[i+1]==a[i]){
                
            }
            else{
                max=1;
            }
           // System.out.println(max);
            res= Math.max(res,max);
        }

        if(res==1){
            return 0;
        }
        return res;
    }
}
