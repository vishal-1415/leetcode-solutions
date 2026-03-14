class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length < 2) return new int[] {nums[0]};
        HashMap<Integer,Integer> Map = new HashMap<>();

        for(int num : nums){
            Map.put(num , Map.getOrDefault(num,0)+1);
        }

        List<Integer> list = new ArrayList<>(Map.keySet());
        list.sort((a,b) -> Map.get(b) - Map.get(a));
        
        int[] result = new int[k];

        for(int i=0;i<k;i++){
            result[i] = list.get(i);
        }

        return result;
    }
}