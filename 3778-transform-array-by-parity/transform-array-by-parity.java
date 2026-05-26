class Solution {
    public int[] transformArray(int[] nums) {
        int Even_count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % 2 ==0){
                Even_count++;
            }
        }

        for(int i = 0;i< Even_count;i++){
            nums[i] = 0;
        }

        for(int i = Even_count;i<nums.length;i++){
            nums[i] = 1;
        }

    return nums;
    }
}