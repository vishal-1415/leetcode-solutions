class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0;
        int middle = 0;                         //Dutch National Flag algorithm
        int end = n - 1;
        while (middle <= end) {                     //Time: O(n) → single pass , Space: O(1)
            if (nums[middle] == 0) {
                swap(nums, start, middle);
                start++;
                middle++;
            } else if (nums[middle] == 1) {
                middle++;

            } else if (nums[middle] == 2) {
                swap(nums, middle, end);
                end--;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}