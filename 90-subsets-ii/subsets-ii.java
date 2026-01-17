class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subset(result, new ArrayList<>(), nums, 0);

        return result;
    }
    public static void subset(List<List<Integer>> ans, List<Integer> templist, int[] nums, int s) {

        ans.add(new ArrayList<>(templist));
        for (int i = s; i < nums.length; i++) {

            if (i > s && nums[i] == nums[i - 1])
                continue;

            templist.add(nums[i]);
            subset(ans, templist, nums, i + 1);
            templist.remove(templist.size() - 1);
        }
    }
}