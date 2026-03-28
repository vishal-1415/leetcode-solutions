class Solution {
    public int lengthOfLastWord(String s) {
        String[] parts = s.split(" ");
        String word = parts[parts.length - 1];
        int Len = word.length();

    return Len;    
    }
}