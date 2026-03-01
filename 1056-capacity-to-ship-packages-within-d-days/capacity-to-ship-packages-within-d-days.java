class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min_capacity = 0;//min_capacity is max element of given array
        int max_capacity = 0;// max is sum all elements in the arrays
        for (int w : weights) {
            min_capacity = Math.max(w, min_capacity);
            max_capacity += w;
        }
        // binary search to find optimal capacity
        while (min_capacity < max_capacity) {
            int mid = min_capacity + (max_capacity - min_capacity) / 2;
            if (CanBeShipped(weights, days, mid)) {
                min_capacity = mid + 1;
            } else {
                max_capacity = mid;
            }
        }
        return min_capacity;
    }
    // funtion to shipping capacity 
    public static boolean CanBeShipped(int[] weights, int days, int mid) {
        int shippingDays = 0;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] > mid) {
                shippingDays++;
                sum = 0;
            }
            sum += weights[i];
        }
        return days <= shippingDays;
    }
}