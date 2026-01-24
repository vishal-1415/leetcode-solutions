class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int[] sfreqMap = new int[26];
        int[] pfreqMap = new int[26];
        List<Integer> result = new ArrayList<>();
        // creating or count freq of p ,"abc" --> [1,1,1,0,0...]
        for (char freq : p.toCharArray()) {
            pfreqMap[freq - 'a']++;
        }
        //Sliding window to count freq of s
        for (int i = 0; i < s.length(); i++) {
            sfreqMap[s.charAt(i) - 'a']++;

            if (i >= p.length()) {  //removing the char that is out of window
                sfreqMap[s.charAt(i - p.length()) - 'a']--;
            }
            // checks counts of freqs of both sfreqMap and pfreqMap 
            if (Arrays.equals(sfreqMap, pfreqMap)) {
                result.add(i - p.length() + 1);
            }
        }                                //TC:O(n)  SC:O(1)
        return result;
    }
}