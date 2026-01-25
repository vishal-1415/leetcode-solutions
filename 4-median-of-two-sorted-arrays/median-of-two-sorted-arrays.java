class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] comb = new int[m + n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            comb[index] = nums1[i];
            index++;
        }
        for (int i = 0; i < n; i++) {
            comb[index] = nums2[i];                   //TC:O((n + m) log(n + m)) 
            index++;                                 // SC: O(n + m)
        }
        // sorting the comb[] and find its length
        Arrays.sort(comb);
        int length = comb.length;
        //if comb length is odd
        if (length % 2 == 1) {
            return comb[length / 2];
        }
        //if its even 
        return (comb[length / 2 - 1] + comb[length / 2]) / 2.0;
    }
}