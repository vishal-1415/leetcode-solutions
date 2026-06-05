class Solution {
    public boolean isGoodArray(int[] nums) {
        int  gcd_curr = 0;
        for(int i = 0;i<nums.length;i++){
            gcd_curr = gcd(gcd_curr, nums[i]);

            if(gcd_curr == 1) return true;
        }
        return false;
    }
    public int gcd(int a,int b){
        if(b == 0) return a;

    return gcd(b,a % b);
    }
}