package divideandconquer;
import java.math.BigInteger;
import java.util.Scanner;

public class Karatsuba {
    private final static BigInteger ZERO = new BigInteger("0");
    public static BigInteger karatsuba(BigInteger x, BigInteger y){
        int N= Math.max(x.bitLength(),y.bitLength());
        if(N<=2000 ){
            return x.multiply(y);
        }
        N= N/2 + (N%2);
        BigInteger b = x.shiftRight(N);
        BigInteger a = x.subtract(b.shiftLeft(N));
        BigInteger d = y.shiftRight(N);
        BigInteger c = y.subtract(d.shiftLeft(N));
        // compute sub-expressions
        BigInteger ac    = karatsuba(a, c);
        BigInteger bd    = karatsuba(b, d);
        BigInteger abcd  = karatsuba(a.add(b), c.add(d));
        return ac.add(abcd.subtract(ac).subtract(bd).shiftLeft(N)).add(bd.shiftLeft(2*N));
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String s1= input.nextLine();
        String s2=input.nextLine();
        BigInteger a= new BigInteger(s1);
        BigInteger b= new BigInteger(s2);
        BigInteger c= a.multiply(b);
        BigInteger d= karatsuba(a,b);

        System.out.println(d);

        System.out.println((c.equals(d)));
    }
}
