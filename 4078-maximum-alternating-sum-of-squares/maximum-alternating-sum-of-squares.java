class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        long[] squares = new long[n];

        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        int positive = (n + 1) / 2;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (i >= n - positive) {
                ans += squares[i];
            } else {
                ans -= squares[i];
            }
        }

        return ans;
    }
}