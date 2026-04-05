class Solution {
    public int secondHighest(String s) {
        int firstMax = Integer.MIN_VALUE;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int temp  = ch - '0';
                firstMax = Math.max(firstMax,temp);
            }
        }
        int secMax = -1;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int temp  = ch - '0';
                if(temp != firstMax){
                    secMax = Math.max(secMax,temp);
                }
            }
        }
    return secMax;    
    }
}