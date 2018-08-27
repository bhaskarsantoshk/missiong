package leetcode;

public class P461HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while ( xor !=0 ){
            int temp = xor & 1;
            if( temp == 1){
                count++;
            }
            xor = xor >> 1;
        }
        return count;
    }
}
