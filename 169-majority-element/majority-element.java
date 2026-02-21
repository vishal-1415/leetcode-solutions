class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int votes = 1;
        int candidate = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] == candidate) {
                votes++;
            } else {
                votes--;
            }

            if (votes == 0) {
                candidate = nums[i];
                votes++;
            }
        }
        return candidate;
    }
}