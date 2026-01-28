class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> CharSet = new HashSet<>();
        int MaxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // If current character already exists in set,
            // shrink window from the left until duplicate is removed
            while (CharSet.contains(s.charAt(right))) {
                CharSet.remove(s.charAt(left));
                left++;                                            //TC:O(n)   SC:O(min(n, charset))
            }

            int currentLength = right - left + 1; //window Size

            CharSet.add(s.charAt(right));// if not,Add current character to the set
            MaxLength = Math.max(MaxLength, currentLength);
        }
        return MaxLength;
    }
}