class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int value : map.keySet()){
            if(map.get(value) == 1){
                return value;
            }
        }
    return -1;    
    }
}