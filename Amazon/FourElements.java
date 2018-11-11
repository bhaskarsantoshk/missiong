package Amazon;
/*
Given an array of integers, find a combination of four elements in the array whose sum is equal to a given value X.
Input:
First line consists of T test cases. First line of every test case consists of an integer N, denoting the number of elements in an array. Second line consists of N spaced array elements. Third line of every test case X.
Output:
Single line output, print 1 if combination is found else 0.
Constraints:
1<=T<=100
1<=N<=100
Example:
Input:
1
6
1 5 1 0 6 0
7
Output:
1
 */
import java.util.*;
public class FourElements {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t!=0){
            int n=in.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            
            int sum=in.nextInt();
            Arrays.sort(a);
            System.out.println(isSumPossible(a,n,sum));
            t--;
        }
    }
    static int isSumPossible(int[] a, int n, int sum){

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int minIndex = j+1;
                int maxIndex = n-1;
                while (minIndex < maxIndex ){
                    int total= a[i]+a[j]+a[minIndex]+a[maxIndex];
                    if( total == sum ){
                        return 1;
                    }
                    else if(total < sum ){
                        minIndex++;
                    }
                    else{
                        maxIndex--;
                    }
                }
            }
        }

        return 0;
    }
}
