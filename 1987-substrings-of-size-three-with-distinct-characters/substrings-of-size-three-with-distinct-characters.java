class Solution {
    public int countGoodSubstrings(String s) {
        char[] chars = s.toCharArray();
        int count = 0;

        for(int i = 0;i<=s.length() - 3;i++){
            if(chars[i] != chars[i+1] &&
               chars[i+1] != chars[i+2] &&
               chars[i] != chars[i+2]   ){
                count++;
               }
        }
    return count;
    }
}