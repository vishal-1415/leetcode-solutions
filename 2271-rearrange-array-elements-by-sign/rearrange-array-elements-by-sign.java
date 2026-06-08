class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int pos_Index = 0;
        int neg_Index = 1;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0){
                result[pos_Index] = nums[i];
                pos_Index += 2; 
            }else{
                result[neg_Index] = nums[i];
                neg_Index += 2;
            }
        }
    return result;
    }
}