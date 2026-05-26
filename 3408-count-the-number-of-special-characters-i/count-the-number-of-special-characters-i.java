class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            char upper = Character.toUpperCase(ch);

            if (map.containsKey(ch) && map.containsKey(upper)) {
                count++;
            }
        }

        return count;
    }
}