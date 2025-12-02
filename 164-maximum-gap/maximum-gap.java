class Solution {
    public int maximumGap(int[] nums) {
        int max_diff=0;
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        for(int i =0;i<nums.length-1;i++){
            int diff = nums[i+1] - nums[i];
            if(diff>max_diff){
                max_diff = diff;
            }
        }
        return max_diff;
    }
}