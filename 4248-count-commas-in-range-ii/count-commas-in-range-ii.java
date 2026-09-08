class Solution {
    public long countCommas(long n) {
        
        long cntcommas = 0;
        long base = 1000;
        
        while(n >= base){
            cntcommas += (n - base +1); 
            base *= 1000;
        }

    return cntcommas;
    }
}