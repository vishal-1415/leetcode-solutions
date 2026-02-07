class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        
        //result[i] = (product of left side) × (product of right side)
        int prefix = 1;
        int suffix = 1;
         // First pass: store left products
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];                  //TC:O(n)   SC:O(1)
        }
        // Second pass: multiply right products
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }

        return result;
    }
}