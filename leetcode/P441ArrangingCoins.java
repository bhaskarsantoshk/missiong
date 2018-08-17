package leetcode;

public class P441ArrangingCoins {
    public int arrangeCoins(int n) {
        return (int) (( Math.sqrt(1+ 8.0 * n))-1 )/2;
    }
}
