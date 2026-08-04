class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;

        for(int num : nums){
            Min = Math.min(Min,num);
            Max = Math.max(Max,num);
            set.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for(int i = Min;i<= Max;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }

    return result;
    }
}