class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");

        String result = "";
        for(int i = parts.length -1 ;i>= 0;i--){
            
            result += ""+parts[i];

            if(i!=0){
                result +=  " ";
            }
        }
    return result;    
    }
}