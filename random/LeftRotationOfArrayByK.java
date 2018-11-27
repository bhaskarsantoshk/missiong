package missiong.random;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class LeftRotationOfArrayByK {
    public static void main(String[] args){
        int []a = {1,2,3,4,5};
        leftRotateByK(a,2);
        printArray(a);
    }
    @Contract(value = "_, _ -> param1", pure = true)
    static int[] leftRotateByK(int[] a, int k){
        k= k%a.length;
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);
        return a;
    }

    private static void reverse(int[] a, int l, int r) {
        for(int i=l;i<=r/2; i++){
            swap(a,i,r-i);
        }
    }
    private static void swap(int[] a, int i, int j) {
        int temp= a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void printArray(@NotNull int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
