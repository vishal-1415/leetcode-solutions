class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int Min_speed = 1;
        int Max_speed = 0;

        for (int p : piles) {
            Max_speed = Math.max(p, Max_speed);
        }

        while (Min_speed < Max_speed) {
            int mid = Min_speed + (Max_speed - Min_speed) / 2;        //binary Search 

            if (EatwithinTime(piles, h, mid)) {
                Max_speed = mid;
            } else {
                Min_speed = mid + 1;
            }
        }
        return Min_speed;
    }

    private boolean EatwithinTime(int[] piles, int h, int speed) {
        int hours = 0;
        for (int p : piles) {
            hours += (int) Math.ceil((double) p / speed);
        }
        return hours <= h;
    }

}