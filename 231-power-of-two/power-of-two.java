class Solution {
    public boolean isPowerOfTwo(int n) {
        //TC :O(1) SC:O(1)
    //     return n > 0 && (n & (n - 1)) == 0; 

    if(n<=0) return false;

    while(n%2 == 0){
        n /= 2;
    // TC : O(log n)
    }
    return n == 1;
    }
}