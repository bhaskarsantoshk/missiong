package missiong.random;

public class HighestPowerOfTwo {
    public static void main(String [] args){
        System.out.println(highestPowerOfTwo(15));
        System.out.println(highestPowerOfTwo(-1));
        System.out.println(highestPowerOfTwo(0));
        System.out.println(highestPowerOfTwo(1024));
    }
    static int highestPowerOfTwo(int n){
        if (n<=0){
            return 0;
        }
        int res = 1;
        while (res <= n){
            res *=2;
        }
        return res/2;
    }
}
