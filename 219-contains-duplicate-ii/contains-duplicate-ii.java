class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            if (set.contains(nums[i])) {        //TC:O(n)  SC:O(k)
                return true;
            }                         
            
            set.add(nums[i]);

            if (set.size() > k) {//This removes the element that is k indices behind.
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}