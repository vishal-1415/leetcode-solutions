class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i] ,map.getOrDefault(nums[i] ,0)+1);

            while(map.get(nums[i]) > k){
                 map.put(nums[left] ,map.get(nums[left]) -1);
                 left++;
            }
            res = Math.max(res, i - left + 1);
        }

        return res;
    }
}