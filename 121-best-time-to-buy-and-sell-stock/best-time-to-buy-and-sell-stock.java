class Solution {
    public int maxProfit(int[] prices) {
        int Buy_Price = prices[0];
        int profit = 0;
                                     //similar to Kadane's Algorithm
        for (int i = 1; i < prices.length; i++) {
            // check if next prices is less than Buy_Price
            if (prices[i] < Buy_Price) {  
                Buy_Price = prices[i]; //update the lower prices   
            }
            int current_profit = prices[i] - Buy_Price;
            profit = Math.max(profit, current_profit);     

        }                     //TC:O(n)  SC:O(1)
        return profit;
    }
}