class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int right = 0;right < s.length() ;right++){
            char rightChar = s.charAt(right);

            map.put(rightChar,map.getOrDefault(rightChar , 0)+1);

            while(map.get(rightChar) > 2){
                char leftChar = s.charAt(left);

                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }
            int currLen = right - left + 1;
            maxLen = Math.max(maxLen, currLen);
        }
    return maxLen;
    }
}