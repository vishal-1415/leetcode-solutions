class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;                                       //TC:O(n)  SC:O(1)
        int rightSum = 0;
        /// summing all nums into rightSum (prefixSum)
        for (int i = 0; i < n; i++) {
            rightSum += nums[i];
        }     
        int leftSum = 0;
        //adding leftSum elements one by one,keeps checking rightSum == leftSum
        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            if (rightSum == leftSum) {
                return i;
            }
            //after everycheck keeps reducing rightSum windows Sum ,meanwhile incre leftSum 
            rightSum -= nums[i];
        }
        return -1;
    }
}