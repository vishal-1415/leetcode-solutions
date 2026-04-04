class Solution {
    public int firstMatchingIndex(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(chars[i] == chars[s.length() - i - 1]){
                return i;
            }

        }
    return -1;    
    }
}