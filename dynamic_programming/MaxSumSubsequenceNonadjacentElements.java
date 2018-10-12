package dynamic_programming;

public class MaxSumSubsequenceNonadjacentElements {
    public static void main(String[] args) {
        int[] v1 = new int[]{1, 6, 10, 14, 50, -20, -5, -10};
        System.out.println("Max non adjacent sum: " + find_max_sum_nonadjacent(v1));
    }
    static int find_max_sum_nonadjacent(int[] a) {
        //TODO: Write - Your - Code
        int result[] = new int[a.length];
        if(a.length == 1){
            return a[0];
        }
        else if(a.length == 2 ){
            return Math.max(a[0] , a[1]);
        }
        else {
            result[0] = a[0];
            result[1] = Math.max(a[0], a[1]);
            for(int i=2; i<a.length ; i++){
                result[i]= Math.max(result[i-2]+a[i], result[i-1]);
            }

            return result[a.length-1];
        }
    }
}
