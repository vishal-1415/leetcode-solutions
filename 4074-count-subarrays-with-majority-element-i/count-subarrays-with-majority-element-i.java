class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int subarrays = 0;
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j = i;j<nums.length;j++){
                if(nums[j] == target)  count++;

                int length = j - i + 1;
                if(count > length/2) subarrays++;
            }
        }
    return subarrays;
    }
}