package missiong.random;

public class KthSmallestElement {
    public static void main(String[] args){
        Integer arr[] = new Integer[]{7, 10, 4, 3, 20, 15};
        int k = 4;
        System.out.print( kthSmallestElement(arr, 0, arr.length - 1, k) );
    }

    private static int kthSmallestElement(Integer[] arr, int low, int high, int k) {
        if(k>0 && k<= high - low +1){

        }

        return -1;
    }
}
