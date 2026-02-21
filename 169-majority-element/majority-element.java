class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int votes = 0;
        int candidate = 0;

        for (int i = 0; i < n; i++) { //Boyer–Moore majority vote algorithm
            if (votes == 0) {
                candidate = nums[i]; //set candidate[nums] if votes is Zero
            }

            if (nums[i] == candidate) {
                votes++;                     //TC :O(n) SC:O(1)
            } else {
                votes--;
            }

        }
        return candidate;
    }
}