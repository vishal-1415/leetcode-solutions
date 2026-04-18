class Solution {
    public int mirrorDistance(int n) {
        int OG_num = n;
        int reversed = 0;
        while(n>0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        int result = Math.abs(OG_num - reversed);

    return result;    
    }
}