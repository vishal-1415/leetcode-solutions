class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        List<String> result = new ArrayList<>(map.keySet());

        Collections.sort(result, (a,b) -> {
            if(map.get(a).equals(map.get(b))){
                return a.compareTo(b);
            }else{
                return map.get(b) - map.get(a);
            }
        });

    return result.subList(0,k);    
    }
}