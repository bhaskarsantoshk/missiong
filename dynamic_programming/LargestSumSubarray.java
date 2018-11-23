package dynamic_programming;

public class LargestSumSubarray {
    public static void main(String[] args) {
        int[] v = new int[]{1, 10, -1, 11, 5, -30, -7, 20, 25, -35};
        System.out.println("Sum of largest subarray: " + find_max_sum_sub_array(v));
        int[] v1 = new int[]{-15, -14, -10, -19, -5, -21, -10};
        System.out.println("Sum of largest subarray: " + find_max_sum_sub_array(v1));
    }

    static int find_max_sum_sub_array(int[] A) {
        int max_sum = A[0];
        int sum = A[0];
        for(int i= 1; i < A.length ; i++){
            if( sum < 0 ){
                sum = A[i];
            }
            else {
                sum += A[i];
            }
            if(sum > max_sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
}
