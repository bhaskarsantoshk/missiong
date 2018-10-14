package codeforces;
import java.util.Scanner;

public class CFContest1058PC {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        int a[]=new int[n];
        for (int i=0;i<s.length();i++){
            a[i]=Integer.parseInt(s.charAt(i)+"");
        }
        if (KpartitionsPossible(a,n,3)==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    static boolean KpartitionsPossible(int arr[], int n, int K)
    {
        // Creating and filling prefix sum array
        int prefix_sum[]=new int[n];
        prefix_sum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefix_sum[i] =  prefix_sum[i - 1] + arr[i];
        int total_sum = prefix_sum[n-1];
        if (total_sum % K != 0)
            return false;
        // a temporary variable to check
        // there are exactly K partitions
        int temp = 0;
        int pos = -1;
        for (int i = 0; i < n; i++)
        {
            // find suitable i for which first
            // partition have the required sum
            // and then find next partition and so on
            if (prefix_sum[i] - (pos == -1 ? 0 :
                    prefix_sum[pos]) == total_sum / K)
            {
                pos = i;
                temp++;
            }

            // if it becomes greater than
            // required sum break out
            else if (prefix_sum[i] - prefix_sum[pos] >
                    total_sum / K)
                break;
        }
        // check if temp has reached to K
        return (temp == K);
    }
}
