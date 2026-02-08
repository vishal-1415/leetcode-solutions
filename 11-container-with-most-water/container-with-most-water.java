class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]); //check which is less for water storage
            int width = right - left;   
            max = Math.max(max, h * width);  // to calculate area : H*W

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;                 //TC:O(n) SC:O(1)
            }
        }
        return max;
    }
}