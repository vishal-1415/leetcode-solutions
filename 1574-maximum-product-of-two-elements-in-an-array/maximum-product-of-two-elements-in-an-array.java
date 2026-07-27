class Solution {
    public int maxProduct(int[] nums) {
        int MaxPrt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int currPrt = (nums[i] - 1) * (nums[j] - 1);
                MaxPrt = Math.max(MaxPrt, currPrt);
            }
        }
        return MaxPrt;
    }
}