class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int votes = 0;
        int candidate = 0;

        for (int i = 0; i < n; i++) {
            if (votes == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                votes++;
            } else {
                votes--;
            }

        }
        return candidate;
    }
}