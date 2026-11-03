class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int x : nums){
            max = Math.max(max,x);
        }
        long moves = 0;
        for (int x : nums){
            moves += max - x;
        }
    
    return (int) moves;
    }
}