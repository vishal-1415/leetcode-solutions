class Solution {
    public int maxProfit(int[] prices) {
        int Buy_Price = prices[0];
        int profit = 0;
        for(int i =1;i<prices.length;i++){

            if(prices[i] < Buy_Price){
                Buy_Price = prices[i];
            }
                int current_profit = prices[i] - Buy_Price;
                profit = Math.max(profit,current_profit);
            
        }
        return profit;
    }
}