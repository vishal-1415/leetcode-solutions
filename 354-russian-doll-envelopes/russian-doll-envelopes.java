class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        Arrays.sort(envelopes,(a,b) ->{
                if(a[0] == b[0])
                    return b[1] - a[1];
                return a[0] - b[0];
            });

        int size = 0;
        int[] list = new int[n];

        for(int[] envelope : envelopes){
            int height = envelope[1];

            int left = 0;
            int right = size;

            while(left < right){
                int mid = left + (right - left)/2;

                if(list[mid] < height){
                    left = mid + 1;
                }else{
                    right = mid;
                }
            }
            list[left] = height;

            if(left == size){
                size++;
            }
        }

    return size;
    }
}