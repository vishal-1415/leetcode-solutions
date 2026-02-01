class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max_product = nums[0];

        for (int i = 0; i < n; i++) {
            int current_product = 1;
            for (int j = i; j < n; j++) {
                current_product *= nums[j];
                max_product = Math.max(max_product, current_product);
            }
        }
        return max_product;
    }
}