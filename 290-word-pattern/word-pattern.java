class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");

        if(word.length != pattern.length()) return false;

        HashMap<Object,Integer> map = new HashMap<>();

        for(int i = 0;i<word.length;i++){
            char ch = pattern.charAt(i);

            if(!Objects.equals(map.put(ch,i) , map.put(word[i],i))){
                return false;
            }
        } 
    return true;
    }
}