class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> SumCountMap = new HashMap<>();
        SumCountMap.put(0, 1); // Helps count subarrays starting from index 0
        int result = 0;
        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];                                    //TC:O(n)   SC:O(n)
            //Each occurrence = one valid subarray
            if (SumCountMap.containsKey(prefixSum - k)) {
                result += SumCountMap.get(prefixSum - k);
            }
            // Store the current prefix sum in the map ,If it already exists, increase its count
            // If not, initialize it with 1
            SumCountMap.put(prefixSum, SumCountMap.getOrDefault(prefixSum, 0) + 1);
        }
        return result;
    }
}