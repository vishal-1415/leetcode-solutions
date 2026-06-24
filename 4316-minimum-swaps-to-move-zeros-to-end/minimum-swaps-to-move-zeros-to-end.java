class Solution {
    public int minimumSwaps(int[] nums) {
        int NonZeroCount = 0;
        for(int num : nums){
            if(num != 0) NonZeroCount++;
        }

        int swap = 0;
        for(int i = 0;i<NonZeroCount;i++){
            if(nums[i] == 0) swap++;
        }

    return swap;
    }
}