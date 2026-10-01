class Solution {
    public int maxProfit(int[] prices) {
        
        int cost1 = Integer.MAX_VALUE;
        int cost2 = Integer.MAX_VALUE;
        int price1 = 0;
        int price2 = 0;

        for(int price : prices){
             cost1 = Math.min(cost1 , price);
             price1 = Math.max(price1 , price - cost1);
             cost2 = Math.min(cost2 , price - price1);
             price2 = Math.max(price2 , price - cost2);
        }
        
    return price2;
    }
}