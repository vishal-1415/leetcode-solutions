class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int x = 0;
        int og = n;
        while(n>0){
            int digit = n % 10;
            if(digit != 0){
            x = x*10 + digit;
            }
            n /= 10;
        }
        
        n = x;
        int num =0;
        while(n>0){
            int digit = n % 10;
            if(digit != 0){
            num = num*10 + digit;
            }
            n /= 10;
        }

        int x_copy = num;
        while(x_copy > 0){
            int digit = x_copy % 10;
            sum += digit;
            x_copy /= 10;
        }
    
        long ans = (long)num * sum;

    return ans;
    }
}