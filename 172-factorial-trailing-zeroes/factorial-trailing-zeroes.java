class Solution {
    public int trailingZeroes(int n) {
        int countZeros = 0;
        int rem = 0;
        for(int i = 5;i<=n;i=i*5){
            rem = n/i;
            if(rem!=0){
                countZeros += rem;
            }
        }
        return countZeros;
    }
}