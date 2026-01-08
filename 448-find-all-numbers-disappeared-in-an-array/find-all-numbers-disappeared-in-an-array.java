class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // add only unquie number to unqiueNums using set
        Set<Integer> unqiueNums = new HashSet<>();
        for (int num : nums) {
            unqiueNums.add(num);
        }


        List<Integer> resultList = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {             // Complexity
            if (!unqiueNums.contains(i)) {                  //    Time: O(n)
                resultList.add(i);                           //   Space: O(n)
            }
        }

        return resultList;
    }
}