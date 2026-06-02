class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                result.append(ch);
            }else{
                result.deleteCharAt(result.length()-1);
            }
            
        }
    return result.toString();
    }
}