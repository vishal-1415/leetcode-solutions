// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {

//    //If a number is missing, its index never gets marked negative — so it stays positive.
//         for (int i = 0; i < nums.length; i++) {
//             int index = Math.abs(nums[i]) - 1;
//             if (nums[index] > 0) {
//                 nums[index] = -nums[index];
//             }
//         }
//                                                                     //Time: O(n)
//         List<Integer> resultList = new ArrayList<>();               //Space: O(1) (excluding output list)
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > 0) {
//                 resultList.add(i+1);
//             }
//         }

//         return resultList;
//     }
// }

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