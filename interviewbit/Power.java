package missiong.interviewbit;

import java.math.BigInteger;

public class Power {
    public int power(String A) {
        BigInteger a = new BigInteger(A);
        if(a.equals(BigInteger.ONE) || a.equals(BigInteger.ZERO)){
            return 0;
        }
        for(int i=0;i<a.bitLength();i++){
            if(a.testBit(i)){
                return 0;
            }
        }
        return a.testBit(a.bitLength()-1)?1:0;

    }
}
