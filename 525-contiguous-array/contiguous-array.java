class Solution {
    public int findMaxLength(int[] nums) {
        //converting all 0 to -1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = -1;
        }
        int sum = 0;
        int maxLength = 0;
        Map<Integer, Integer> Map = new HashMap<>();
        Map.put(0, -1); //sential value

        for (int i = 0; i < nums.length; i++) {            //TC:O(n)   SC:O(n)
            sum += nums[i];
                                      
            if (Map.containsKey(sum)) { // if present update the length
                int last = Map.get(sum);
                maxLength = Math.max(maxLength, i - last);
            }
             else {
                Map.put(sum, i);
            }
        }
        return maxLength;
    }
}