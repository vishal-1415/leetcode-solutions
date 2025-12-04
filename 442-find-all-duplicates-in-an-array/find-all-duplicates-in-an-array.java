class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i =0;
        int n = nums.length;
        while(i<n){
            int correct_index = nums[i]-1;
            if(nums[i]!=nums[correct_index]){
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}