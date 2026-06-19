class Solution {
    public int largestAltitude(int[] gain) {
        int curr_H = 0;
        int max_H = 0;
        for(int num : gain){
            curr_H += num;
            max_H = Math.max(curr_H ,max_H);
        }
    return max_H;
    }
}