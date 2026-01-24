class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] sfreqMap = new int[26];
        int[] pfreqMap = new int[26];
        List<Integer> result = new ArrayList<>();
        for(char freq : p.toCharArray()){                          
            pfreqMap[freq - 'a']++;
        }
        for(int i =0 ;i<s.length();i++){
            sfreqMap[s.charAt(i) - 'a']++;

            if(i>=p.length()){
                sfreqMap[s.charAt(i - p.length()) - 'a']--;
            }

            if(Arrays.equals(sfreqMap,pfreqMap)){
                result.add(i - p.length() +1);
            }
        }

        return result;
    }
}