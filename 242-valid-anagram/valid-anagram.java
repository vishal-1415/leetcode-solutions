class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char x[] = s.toCharArray();// string to char[] -> ['t','r','u','e']
        char y[] = t.toCharArray();

        Arrays.sort(x); //sort for comparing
        Arrays.sort(y);

        for (int i = 0; i < x.length; i++) { //comparing indexs with both
            if (x[i] != y[i]) {
                return false;
            }
        }                                   //TC:O(n log n)   SC:O(n)
        return true;
    }
}