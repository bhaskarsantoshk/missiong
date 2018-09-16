package arrays;

public class FindSmallestCommonNumber {
    public static void main(String []args){
        int[] v1 = new int[]{1, 6, 10, 14, 50};
        int[] v2 = new int[]{-1, 6, 7, 8, 50};
        int[] v3 = new int[]{0, 6, 7, 10, 25, 30, 40};
        int result = find_least_common_number(v1, v2, v3);
        System.out.println("Least Common Number: " + result);
    }

    static int find_least_common_number(int[] arr1,
                                        int[] arr2,
                                        int[] arr3) {
        //TODO: Write - Your - Code
        int i=0,j=0,k=0;
        while ( i < arr1.length && j < arr2.length && k < arr3.length ){
            if(arr1[i] == arr2[j] && arr1[i] == arr1 [k]){
                return arr1[i];
            }
            else {
                if (arr1[i] <= arr1[j] && arr1[i] <= arr3[k]){
                    i++;
                }
                else if ( arr2[j] <= arr1[i] && arr2[j] <= arr3[k]){
                    j++;
                }
                else{
                    k++;
                }
            }
        }
        return -1;
    }
}
