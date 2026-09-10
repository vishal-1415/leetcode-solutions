class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0;i<s.length();i++){
            
            count += pali(s,i , i);

            count += pali(s,i,i+1);
        }
    return count;
    }
    public static int pali(String s ,int left , int right){
        int count = 0;
        while(left >= 0 && right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                count++;
            }else{
                break;
            }
            
        }
    return count;
    }
}