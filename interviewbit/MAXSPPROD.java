package missiong.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;

public class MAXSPPROD {
    public int maxSpecialProduct(ArrayList<Integer> A) {
        int l[]= new int[A.size()];
        int r[]= new int[A.size()];
        int size = A.size();
        l[0] = 0;
        int maxSoFar = 0;
        int maxIndex = 0;
        for (int i=1;i<size;i++){
            if(A.get(i-1)>= maxSoFar){
                maxSoFar = A.get(i-1);
                l[i] = i-1;
                maxIndex = i-1;
            }
            else{
                l[i]= maxIndex;
            }
        }
        print(l);
        r[size-1] = 0;
        for(int i=size-2;i>=0;i--){
            if(A.get(i+1) >=maxSoFar){
                maxSoFar = A.get(i+1);
                r[i] = i+1;
                maxIndex = i+1;
            }
            else{
                r[i]= maxIndex;
            }
        }
        print(r);
        int specialProduct= 0;
        for(int i=0;i<A.size();i++){
            int currentProd = ((l[i] % 1000000007)* (r[i] % 1000000007))%1000000007;
            specialProduct = Math.max(specialProduct, currentProd);
        }

        System.out.println(specialProduct);
        return specialProduct;
    }
    public void print(int[] a){
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        MAXSPPROD obj = new MAXSPPROD();
        ArrayList<Integer> a= new ArrayList<>();
        int arr[] = {5, 9, 6, 8, 6, 4, 6, 9, 5, 4, 9};
        for(int x:arr){
            a.add(x);
        }
        obj.maxSpecialProduct(a);
    }
}
