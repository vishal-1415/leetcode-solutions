class Solution {
    public boolean checkValidString(String s) {
        int left = 0;
        int right = 0;

        for(char ch : s.toCharArray()){

            if(ch == '('){
                left += 1;
            }else{
                left += -1;
            }

            if(ch == ')'){
                right += -1;
            }else{
                right += 1;
            }

            if(right < 0) return false;

            left = Math.max(left , 0);
        }
    return left == 0;
    }
}