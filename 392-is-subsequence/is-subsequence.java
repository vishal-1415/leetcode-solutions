class Solution {
    public boolean isSubsequence(String s, String t) {
        int S_index = 0;
        int T_index = 0;

        while(S_index < s.length() && T_index < t.length()){
            if(s.charAt(S_index) == t.charAt(T_index)){
                S_index++;
            }
            T_index++;
        }

    return S_index == s.length();
    }
}