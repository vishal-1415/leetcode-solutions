 class Solution {
    public int characterReplacement(String s, int k) {
        int[] FreqMap = new int[26];
        int left = 0;
        int maxfreq = 0;
        int MaxLength = 0;

        for(int right=0;right<s.length();right++){

            FreqMap[s.charAt(right) - 'A']++; //update current freq of char
            maxfreq = Math.max(maxfreq,FreqMap[s.charAt(right) - 'A']); 

            int windowlength = right - left+1;

            if(windowlength - maxfreq >k){   //if windowlength - maxfreq >k ,we need shrink win
                FreqMap[s.charAt(left) - 'A']--;
                left++;
            }
            windowlength = right - left+1;          //TC:O(n)   SC:O(1)
            MaxLength = Math.max(windowlength,MaxLength);
        }
        return MaxLength;
    }
}