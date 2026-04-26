class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder answer = new StringBuilder();

        for(int i = 0;i<s.length();i++){

            if(s.charAt(i) == ')'){
                count--;
            }

            if(count != 0){
                answer.append(s.charAt(i));
            }

            if(s.charAt(i) == '('){
                count++;
            }
        }

    return answer.toString();    
    }
}