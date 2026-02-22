class Solution {
    public int minAddToMakeValid(String s) {
        int countOpening = 0;
        int countClosing = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                countOpening++;
            }else{
                if(countOpening > 0){    //TC:O(n)  SC:O(1)
                    countOpening--;
                }else{
                    countClosing++;
                }
            }
        }

        return countOpening + countClosing;
    }
}