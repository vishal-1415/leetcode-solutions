class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int left = 0;
        int current = 0;
        int max = 0;
        for (int right = 0; right < n; right++) {

            current += Math.abs(s.charAt(right) - t.charAt(right));

            while (current > maxCost) {
                current -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}