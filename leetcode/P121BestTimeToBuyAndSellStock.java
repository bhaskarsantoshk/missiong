package leetcode;

public class P121BestTimeToBuyAndSellStock {

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
