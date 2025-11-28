class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = leftbound(nums,target);
        int right = rightbound(nums,target);

        return new int[] {left,right};

    }
        int leftbound(int[] nums, int target){
            int start = 0;
            int end = nums.length-1;
            int ans = -1;
            while(start<=end){
                int mid = start +(end-start)/2;
                if(nums[mid]==target){
                    ans = mid;
                    end = mid-1;
                 }
                else if(target>nums[mid])
                {
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
                }
             return ans;   
            }
            
        int rightbound(int[] nums, int target){
            int start = 0;
            int end = nums.length-1;
            int ans = -1;
            while(start<=end){
                int mid = start +(end-start)/2;
                if(nums[mid]==target){
                    ans = mid;
                    start = mid+1;
                }
                else if(target>nums[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
                }
            return ans;    
            }
            
        }

