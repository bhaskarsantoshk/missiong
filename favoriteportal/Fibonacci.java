package favoriteportal;

import java.util.Scanner;

public class Fibonacci {

    private final long[][][] exponents;

    public Fibonacci(){
        exponents = new long[64][2][2];
        exponents[0]=new long[][]{{1,1},{1,0}};

        for (int i=1;i<exponents.length;i++){
            exponents[i]=square(exponents[i-1]);
        }
    }

    public  long[][] square(long[][] matrix){
        return multiply(matrix,matrix);
    }

    private  long[][] multiply(final long[][] matrix1, final long[][] matrix2) {
        final long[][] result = new long[matrix1[0].length][matrix2.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[i].length; k++) {
                    result[i][j]=(result[i][j]%1000000007 ) + ((matrix1[i][k] %1000000007) * (matrix2[k][j] % 1000000007))%1000000007;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t!=0 ){
            long n = in.nextLong();

            System.out.println(new Fibonacci().fibonacci(n));

            t--;
        }
    }

    public  long fibonacci(final long n){
        if(n<0){
            throw new IllegalArgumentException();
        }
        else if (n==0 || n==1){
            return 1;
        }
        else{
            final long[][] matrix = binaryExponentiation(n-1);
            return (matrix[0][0] % 1000000007 + matrix[0][1] % 1000000007)%1000000007  ;
        }
    }

    public  long[][] binaryExponentiation(final long n){
        long[][] result = new long[][]{{1,0},{0,1}};

        for (int i= 63; i>=0; i--){
            if ( (n& (1L<<i)) !=0L ){
                result  = multiply(result, exponents[i]);
            }
        }

        return result;
    }



}
