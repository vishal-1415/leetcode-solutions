class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> Map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            Map.put(ch,Map.getOrDefault(ch,0) + 1);
        }

        List<Character> list = new ArrayList<>(Map.keySet());
        list.sort((a,b) ->Map.get(b) - Map.get(a));
        
        StringBuilder result = new StringBuilder();

        for(char c : list){ //tree , ee -> 2 ,so we need to append 'e' for two times
            int freq = Map.get(c);
            for(int i = 0;i<freq;i++){
                result.append(c);
            }
        }
    return result.toString();    //TC :O(n) SC:O(n)
    }
}