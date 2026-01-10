class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int index = n-1;

        int[] result = new int[n];

        while(left<=right){
            int leftsqrt = nums[left] * nums[left];
            int rightsqrt = nums[right] * nums[right];

            if(leftsqrt<rightsqrt){
                    result[index] = rightsqrt;
                    right--;
                    index--;
            }else{
                result[index] = leftsqrt;
                    left++;
                    index--;
            }    
        }
        return result;

    }
}