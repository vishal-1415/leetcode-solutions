class Solution {
    public int rob(int[] nums) {
        if (nums.length < 2)
            return nums[0];

        return Math.max(
                helpRobber(nums, 0, nums.length - 2),
                helpRobber(nums, 1, nums.length - 1));
    }

    public int helpRobber(int[] nums, int start, int end) {
        int prevRob = 0;
        int maxRob = 0;
        for (int i = start; i <= end; i++) {
            int temp = prevRob;
            prevRob = Math.max(maxRob + nums[i], prevRob);
            maxRob = temp;
        }
        return prevRob;
    }
}