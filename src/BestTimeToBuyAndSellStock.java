import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * <p>
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * <p>
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     */

    public static int maxProfit(int[] prices) {
        // Sets the first minimum price to the first price we ever see
        int currentMinPrice = prices[0];
        // Lowest possible integer, it's all up from here, hopefully
        int maxProfit = Integer.MIN_VALUE;
        System.out.println(Arrays.toString(prices));
        for (int i = 0; i <= prices.length - 1; i++) {
            System.out.println("currentMinPrice = " + currentMinPrice);
            System.out.println("maxPofit = " + maxProfit);
            // Saving the lowest price that we find along the way to currentMinPrice
            // This does nothing other than keep track of the lowest price
            if(prices[i] < currentMinPrice){
                currentMinPrice = prices[i];
            }
            // By subtracting the lowest minimum price we've seen before from the
            // current day price we're able to see if current day's maxProfit is
            // higher than the previous maxProfit
            if(prices[i] - currentMinPrice > maxProfit){
                maxProfit = prices[i] - currentMinPrice;
            }
        }
        return maxProfit;
    }
}
