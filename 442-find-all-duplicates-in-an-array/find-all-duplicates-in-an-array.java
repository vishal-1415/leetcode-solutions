class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(nums[i]==nums[i+1]){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}