class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for(int i = 0;i<s.length()-1;i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);

            int sum = Math.abs((int)ch1 - (int)ch2);
            score += sum;
            
        }
    return score;
    }
}