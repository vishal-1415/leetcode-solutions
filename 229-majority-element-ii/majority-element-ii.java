class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
    
        int threshold = nums.length/3;
        List<Integer> result = new ArrayList<>();
        for(int num : map.keySet()){
            if(map.get(num) > threshold){
                result.add(num);
            }
        }
    return result;
    }
}