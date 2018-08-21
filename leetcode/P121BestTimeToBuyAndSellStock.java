package leetcode;

public class P121BestTimeToBuyAndSellStock {
//    public int maxProfit(int[] prices) {
//        int max=0;
//        for(int i = prices.length-1 ; i > 0 ; i--){
//            for(int j= i-1 ; j >= 0 ; j--){
//                int temp = prices[i] - prices [j];
//                max = Math.max( max , temp );
//            }
//        }
//
//        return max;
//    }

    public int maxProfit(int[] prices){
        int minprice= Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i < prices.length ; i++ ){
            minprice = Math.min(minprice , prices[i]);
            maxprofit = Math.max(prices[i]-minprice , maxprofit);
        }
        return maxprofit;
    }
}
