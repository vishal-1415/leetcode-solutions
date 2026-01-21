class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;
        int right = 0;
        while(right<nums.length){
            currentSum += nums[right];
            right++;
            while(currentSum >= target){
                int currentWindowSize = right - left;
                minLenWindow = Math.min(minLenWindow,currentWindowSize);

                currentSum -= nums[left];
                left++;

            }
        }
        return  minLenWindow == Integer.MAX_VALUE ? 0:minLenWindow;

    }
}