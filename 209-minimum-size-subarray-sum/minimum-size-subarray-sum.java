class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow = Integer.MAX_VALUE;
        int currentSum = 0;

        int left = 0;  //two pointers
        int right = 0;

        while (right < nums.length) {
            //finding current sum and increase window size
            currentSum += nums[right];
            right++;
            //reducing window size if current sum is getting larger
            while (currentSum >= target) {
                int currentWindowSize = right - left; //window size

                minLenWindow = Math.min(minLenWindow, currentWindowSize);

                currentSum -= nums[left];
                left++;
            }
        } //if minLenWindow still == to MAX_VALUE give zero as answer or return whatever in minLenWin
        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}