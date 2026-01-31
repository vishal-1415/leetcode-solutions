class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int Window_sum = 0;
        int Max_avg = 0;
        int left = 0;
        for(int i=0;i<k;i++){
            Window_sum += nums[i];
        }
        Max_avg = Window_sum;
        for(int right = k;right <nums.length;right++ ){
            Window_sum += nums[right];
            Window_sum -= nums[left];
            left++;
            Max_avg = Math.max(Window_sum,Max_avg);
        }
        return (double)Max_avg/k;
    }
}