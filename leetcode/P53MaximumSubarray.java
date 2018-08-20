package leetcode;

public class P53MaximumSubarray {
    public int maxSubArray(int[] a) {
        int local_max_sum = a[0];
        int global_max_sum = a[0];

        for( int i = 1; i < a.length ; i++ ){
            local_max_sum = Math.max( local_max_sum + a[i] , a[i]);
            global_max_sum = Math.max( local_max_sum , global_max_sum );
        }

        return  global_max_sum;
    }
}
