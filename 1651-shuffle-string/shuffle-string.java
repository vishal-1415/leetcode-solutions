class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] ch = new char[s.length()];
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<indices.length;i++){
            int index = indices[i];
            ch[index] = s.charAt(i);
        }
        sb.append(ch);

    return sb.toString();
    }  
}