class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prdt = 1;
        int og = n;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            prdt *= digit;
            n /= 10;
        }
        int tot_sum = sum + prdt;
        
        if (og % tot_sum == 0) {
            return true;
        }

        return false;
    }
}