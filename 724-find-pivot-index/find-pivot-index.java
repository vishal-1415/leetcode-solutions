class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int rightSum = 0;
        for(int i =0;i<n;i++){
            rightSum += nums[i];
        }
        int leftSum = 0;
        for(int i =0;i<n;i++){
            leftSum += nums[i];
            if(rightSum == leftSum){
                return i;
            }
            rightSum -= nums[i];
        }
        return -1;
    }
}