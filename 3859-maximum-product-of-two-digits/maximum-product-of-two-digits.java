class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        char[] nums = s.toCharArray();
        Arrays.sort(nums);
        
        int len = nums.length;

        int first_largest = nums[len - 1] - '0';
        int sec_Largest = nums[len - 2] - '0';

        return first_largest * sec_Largest;
    }
}