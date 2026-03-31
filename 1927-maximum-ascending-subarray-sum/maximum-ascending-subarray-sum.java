class Solution {
    public int maxAscendingSum(int[] nums) {
        int max_Sum = nums[0];
        int curr_Sum = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                curr_Sum += nums[i];
            }else{
                curr_Sum = nums[i];
            }
            max_Sum = Math.max(max_Sum,curr_Sum);
        }
    return max_Sum;
    }
}