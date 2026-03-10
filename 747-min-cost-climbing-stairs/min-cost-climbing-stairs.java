class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length + 1];
        
        for(int i = 2;i<=cost.length;i++){  //TC:O(n) SC:O(n)
            minCost[i] = Math.min(cost[i-1] + minCost[i-1] , cost[i-2]+minCost[i-2]);
        }
    return minCost[cost.length];    
    }

}