class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                if(pali(s.substring(i,j))){
                    count++;
                }
            }
        }
    return count;
    }
    public static boolean pali(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
    return true;
    }
}