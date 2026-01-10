class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;

        //    Time Complexity         
        // Squaring loop: O(n)
        // Sorting: O(n log n)
        // Total: O(n log n)

        //    Space Complexity
        // Sorting uses internal space: O(log n) (Java TimSort)
        // Overall: O(1) extra (ignoring sort internals)
    }
}