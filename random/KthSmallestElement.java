package missiong.random;

public class KthSmallestElement {
    public static void main(String[] args){
        Integer arr[] = new Integer[]{7, 10, 4, 3, 20, 15};
        int k = 4;
        System.out.print( kthSmallestElement(arr, 0, arr.length - 1, k) );
    }

    private static int kthSmallestElement(Integer[] arr, int low, int high, int k) {
        if(k>0 && k<= high - low +1){
            int partition_index = partitionIndex(arr, low, high);

            if(partition_index-low == k-1){
                return arr[partition_index];
            }
            else if(partition_index-low > k-1){
                return kthSmallestElement(arr, low, partition_index-1, k);
            }
            else{
                return kthSmallestElement(arr,partition_index+1, high, k-(partition_index-low+1));
            }
        }

        return 100000;
    }

    private static int partitionIndex(Integer[] arr, int low, int high) {
        int pivot = arr[high];
        int index = low;

        for (int j= low; j<= high-1; j++){
            if(arr[j] <= pivot){
                swap(arr, index, j);
                index++;
            }
        }

        swap(arr,index, high);

        return index;
    }

    private static void swap(Integer[] arr, int index, int j) {
        int temp = arr[index];
        arr[index]=arr[j];
        arr[j]= temp;
    }
}
