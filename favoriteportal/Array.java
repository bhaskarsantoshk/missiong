package favoriteportal;

public  class Array {
    public static void printArray(int[] a){
        System.out.println("Array: ");
        for(int i: a){
            System.out.print(i+" ");
        }
    }
    public static void printArray(int[][] a){
        System.out.println("Array: ");
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
