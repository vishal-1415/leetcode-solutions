class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26]; // for freq of chars thats occured
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        boolean[] visited = new boolean[26];

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            freq[ch - 'a']--;

            if (visited[ch - 'a']) {
                continue;
            }

            while (!stack.isEmpty() &&
                    ch < stack.peek() &&
                    freq[stack.peek() - 'a'] > 0) {

                char pop = stack.pop();
                visited[pop - 'a'] = false;

            }

            stack.add(ch);
            visited[ch - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}