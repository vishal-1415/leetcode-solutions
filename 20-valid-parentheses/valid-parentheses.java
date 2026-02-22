class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') { //push opposite of opening bracket
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');

            } else if (stack.isEmpty() || stack.pop() != ch) { //pop the element and check that is same as i push 
                return false;
            }                                           //TC : O(n)    SC : O(n)
        }
        return stack.isEmpty();
    }
}