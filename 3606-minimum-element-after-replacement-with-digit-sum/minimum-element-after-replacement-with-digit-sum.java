class Solution {
    public int minElement(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            int sum_num = 0;
            while(nums[i] > 0){
                sum_num += nums[i] % 10;
                nums[i] /= 10;
            }
            nums[i] = sum_num;
            minimum = Math.min(minimum,nums[i]);
        }
    return minimum;
    }
}