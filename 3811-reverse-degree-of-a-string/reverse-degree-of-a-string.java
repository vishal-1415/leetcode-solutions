class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int reverseValue = 26 - (ch - 'a');
            int multipler = i + 1;

            int product = reverseValue * multipler;
            sum += product;
        }
    return sum;
    }
}