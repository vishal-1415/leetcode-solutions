class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> CharSet = new HashSet<>();
        int MaxLength = 0;
        int left = 0;

        for(int right =0;right< s.length();right++){

            while(CharSet.contains(s.charAt(right))){
                CharSet.remove(s.charAt(left));
                left++;
            }
            int currentLength = right - left +1;
            CharSet.add(s.charAt(right));
            MaxLength = Math.max(MaxLength , currentLength);
        }
        return MaxLength;
    }
}