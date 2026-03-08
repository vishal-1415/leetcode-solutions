class Solution {
    public int rob(int[] nums) {
        if (nums.length < 2) return nums[0];

        int prevRob = 0;      //TC: O(n)   SC:O(1)
        int maxRob = 0;

        for (int i = 0; i < nums.length; i++) {

            int temp = prevRob;
            prevRob = Math.max(maxRob + nums[i], prevRob);
            maxRob = temp;
        }

        return prevRob;
    }
}