class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for(int i =0;i<=s.length() - 10;i++){
            String DNA = s.substring(i,i+10);
            if(seen.contains(DNA)){
                repeated.add(DNA);
            }
            seen.add(DNA);
        }
        return new ArrayList<>(repeated);
    }
}