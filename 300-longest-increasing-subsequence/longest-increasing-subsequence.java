class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] sebs = new int[n];
        Arrays.fill(sebs, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (sebs[j] + 1 > sebs[i]) {
                        sebs[i] = sebs[j] + 1;
                    }
                }
            }
        }
        int max_sequence = 0;
        for (int i = 0; i < sebs.length; i++) {
            max_sequence = Math.max(max_sequence, sebs[i]);
        }

        return max_sequence;
    }
}