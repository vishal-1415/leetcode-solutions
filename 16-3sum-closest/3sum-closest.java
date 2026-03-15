class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = Integer.MIN_VALUE;
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length -1;
            while(left<right){
                int currentSum = nums[i]+nums[left]+nums[right];
                if(currentSum == target)
                   return target;

                if(currentSum<target){
                    left++;
                }else{
                    right--;
                }
            int difftoTarget = Math.abs(currentSum - target);
            if(difftoTarget < minDiff){
                closet = currentSum;
                minDiff = difftoTarget;
            }

            }
        }
    return closet;    
    }
}