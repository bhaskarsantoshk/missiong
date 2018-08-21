package leetcode;

public class P121BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i = prices.length-1 ; i > 0 ; i--){
            for(int j= i-1 ; j >= 0 ; j--){
                int temp = prices[i] - prices [j];
                max = Math.max( max , temp );
            }
        }

        return max;
    }
}
