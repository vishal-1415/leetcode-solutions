class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> roman = new HashMap<>();
         roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        char[] chars =  s.toCharArray();
        int Roman_Value = 0;
        for(int i = 0;i<s.length()-1;i++){
            if(roman.get(chars[i]) >= roman.get(chars[i+1])){
                Roman_Value += roman.get(chars[i]);
            }else{
                Roman_Value -= roman.get(chars[i]);
            }
        }
        Roman_Value += roman.get(chars[s.length()-1]); // Adding last element

    return Roman_Value;    
    }
}