class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int count_Zeros = 0;
        int result = 0;
        for(int right =0;right<n;right++){
            if(nums[right] == 0){
                count_Zeros++;
            }

            while(count_Zeros>1){
                if(nums[left] == 0){
                    count_Zeros--;
                }
                left++;
            }
         result  = Math.max(result , right - left);
        } 
        return result;
    }
}