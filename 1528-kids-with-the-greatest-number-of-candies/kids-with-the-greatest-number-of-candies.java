class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Integer.MIN_VALUE;
        for (int c : candies) {
            maxCandies = Math.max(maxCandies, c);
        }

        List<Boolean> result = new ArrayList<>();

        for (int x : candies) {

            int tot_candies = x + extraCandies;

            if (tot_candies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}