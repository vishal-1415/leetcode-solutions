class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1); 
        }
        // another sol is to use two boolean array ,then check both arrays

        int count = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            char upper = Character.toUpperCase(ch);   //TC:O(n) SC:O(1) -> bcuz the max 26 char can exit two times(52)
 
            if (map.containsKey(ch) && map.containsKey(upper)) {
                count++;
            }
        }

        return count;
    }
}