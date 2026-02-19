class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;                  // Floyd Cycle Detection (slow & fast pointers)

        do {           //we must move them at least once before comparison.so,use do - while     
            slow = findSquares(slow);
            fast = findSquares(findSquares(fast));
        } while (fast != slow);

        if (fast == 1) {
            return true;
        }
        return false;                    //TC:O(log n)  SC:O(1)
    }

    public int findSquares(int num) { //  basic math calculation for sqrt
        int ans = 0;       

        while (num > 0) {
            int rem = num % 10;
            ans = ans + rem * rem;
            num /= 10;
        }
        return ans;
    }
}