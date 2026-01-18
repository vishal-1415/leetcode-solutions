class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];         //This is optimized Bubble Sort
                    nums[j - 1] = nums[j];          // TC :O(n^2)  SC : O(1)
                    nums[j] = temp;
                }
            }
        }
    }
}