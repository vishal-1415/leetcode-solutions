class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int leftsum = 0;
        for (int i = 0; i < n; i++) {
            leftsum += nums[i];
        }
        int rightsum = 0;             //same as problem 724. Find Pivot Index.
        for (int i = 0; i < n; i++) {
            rightsum += nums[i];        //TC:O(n) SC:O(1)
            if (leftsum == rightsum) {
                return i;
            }
            leftsum -= nums[i];
        }
        return -1;
    }
}