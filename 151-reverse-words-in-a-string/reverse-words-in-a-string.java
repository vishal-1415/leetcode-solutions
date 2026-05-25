class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for(int i = parts.length -1 ;i>= 0;i--){

            result.append(parts[i]);

            if(i!=0){
                  result.append(" ");
            }
        }
    return result.toString();    
    }
}