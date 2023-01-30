public class BestTimeToBuyAndSellStock {

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * <p>
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * <p>
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     */

    public static int maxProfit(int[] prices) {
        int currentMinPrice = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i <= prices.length - 1; i++) {
            if(prices[i] < currentMinPrice){
                currentMinPrice = prices[i];
            }
            if(prices[i] - currentMinPrice > maxProfit){
                maxProfit = prices[i] - currentMinPrice;
            }
        }
        return maxProfit;
    }
}
