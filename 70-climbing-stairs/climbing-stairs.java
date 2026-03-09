class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;

       int  ways1 = 2;  //Climbing Stairs is basically Fibonacci disguised as DP.
       int  ways2 = 1;  // TC :O(n)  SC:O(1)

        for(int i = 3;i<=n;i++){

            int temp = ways1 + ways2;
            ways2 = ways1;
            ways1 = temp;
        }

        return ways1;
    }
}