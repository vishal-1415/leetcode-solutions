class Solution {
    public boolean isPowerOfTwo(int n) {
        //TC :O(1) SC:O(1)
        return n > 0 && (n & (n - 1)) == 0; 
    }
}