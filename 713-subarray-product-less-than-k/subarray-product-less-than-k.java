class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int subarray_prdt = 1;         //TC:O(n^2)  SC:O(1)
                                           
            for (int j = i ; j < n; j++) {
                subarray_prdt = subarray_prdt * nums[j];

                if (subarray_prdt < k) {
                    result++;// product will only grow
                }else{
                    break;
                }
            }
        }
        return result;
    }
}