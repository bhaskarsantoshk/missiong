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

        // 1 2 3 4 5
        // 5 1 2 3 4
        // 4 5 1 2 3
        // 3 4 5 1 2
        // 2 3 4 5 1
        // 1 2 3 4 5
        // => k= k % n
        // 0 1 2 3 4
        // 4 0 1 2 3
        // 3 4 0 1 2
        // 2 3 4 0 1
        // 1 2 3 4 0
        // 0 1 2 3 4
        // => Swap(i, (i+k)%n)
        return a;
    }

    static void printArray(@NotNull int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
