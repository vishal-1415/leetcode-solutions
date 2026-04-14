class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int Max_length = 0;
        //Max_length
        for(int num : map.keySet()){
            if(map.containsKey(num + 1)){
                int curr_length = map.get(num) + map.get(num + 1);
                Max_length = Math.max(Max_length,curr_length);
            }
        }
    return Max_length;    
    }
}