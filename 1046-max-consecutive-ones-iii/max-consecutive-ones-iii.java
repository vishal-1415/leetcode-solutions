class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int max_window = 0;
        int left = 0;
        int count_Zeros = 0;
        for (int right = 0; right < n; right++) {

            if (nums[right] == 0) {
                count_Zeros++;
            }

            while (count_Zeros > k) {

                if (nums[left] == 0) {
                    count_Zeros--;
                }

                left++;
            }
            int cur_window = right - left + 1;

            max_window = Math.max(max_window, cur_window);
        }
        return max_window;
    }
}