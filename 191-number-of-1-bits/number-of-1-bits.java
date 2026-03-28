class Solution {
    public int hammingWeight(int n) {
        String binaryBits = Integer.toBinaryString(n);
        int onces = 0;
        for(int i = 0;i<binaryBits.length();i++){   //TC :O(1) SC:O(1)
            char ch = binaryBits.charAt(i);
            if(ch == '1'){
                onces++;
            }
        }
    return onces;    
    }
}