class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> UniqueNums = new HashSet<>();
        for (int num : nums) {
            UniqueNums.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <=nums.length; i++) {
            if (!UniqueNums.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}