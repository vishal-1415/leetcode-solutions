class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        if(s.length() < 10) return new ArrayList<>();
        
        // Loop through the string till the last possible 10-length substring
        for (int i = 0; i <= s.length() - 10; i++) {
            //substring(start,end)extracts characters from index start to end- 1
            String DNA = s.substring(i, i + 10);
            // If this DNA sequence was seen before,then also must not presents repeated too
            if (seen.contains(DNA)) {
                repeated.add(DNA);
            }                                           //TC:O(n) SC:O(n)
            seen.add(DNA);
        }
        return new ArrayList<>(repeated);
    }
}