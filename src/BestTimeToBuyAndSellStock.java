public class BestTimeToBuyAndSellStock {

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     *
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     *
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * */

    public static int maxProfit(int[] prices){
        int profit = 0;
        for(int i = 0;i < prices.length - 1;i++){
            for(int j = i;j < prices.length - 1;j++){
                System.out.println("j = " + prices[j] + " and i = " + prices[i] + "==== j - i = " + (prices[j] - prices[i]));
                if(prices[j] - prices[i] > profit){
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }
}
