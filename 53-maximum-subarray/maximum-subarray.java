class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int current = nums[0];
        for (int i = 1; i < n; i++) {
            current = Math.max(nums[i], current + nums[i]);     //Kadane’s algorithm 
            max = Math.max(current, max);                       //O(n), O(1)
        }
        return max;
    }
}