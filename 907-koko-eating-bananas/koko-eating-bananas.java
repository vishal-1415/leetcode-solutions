class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max_speed = 0;
        int min_speed = 1;
        for (int pile : piles) {// to Find max speed to eat bananas
            max_speed = Math.max(max_speed, pile);
        }
        //binary search to find optimal speed 
        while (min_speed < max_speed) {
            int mid = min_speed + (max_speed - min_speed) / 2;

            if (CanEatWithinTime(piles, h, mid)) {
                max_speed = mid;
            } else {
                min_speed = mid + 1;
            }
        }
        return min_speed;
    }
    // function to check the speed is enough or not
    public static boolean CanEatWithinTime(int[] piles, int h, int mid) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += (int) Math.ceil((double) piles[i] / mid);
        }
        return hours <= h;
    }
}