class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n - 1; i++) {

            int left = i + 1; //from here twosum apporach
            int right = nums.length - 1;

            while (left < right) {
                int current_sum = nums[i] + nums[left] + nums[right];
                
                if (current_sum == 0) { // convert array to list ("Arrays.asList()"")
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (current_sum > 0) { //TC:O(n^2) SC:O(1) ->if Ignoring output space 
                    right--;
                } else {
                    left++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}