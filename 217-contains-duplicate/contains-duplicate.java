class Solution {
    public boolean containsDuplicate(int[] nums) {
        int left = 0;
        int right = 1;
        Arrays.sort(nums);
        while(right<nums.length){
            if(nums[left]==nums[right]){
                return true;
            }else{
                left++;
                right++;
            }
        }
        return false;
    }
}