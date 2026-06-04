class Solution {
    public boolean isVowels(char ch){
        
    return "aeiouAEIOU".indexOf(ch) != -1;
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            char ch1 = arr[i];
            char ch2 = arr[j];
            if(isVowels(ch1) && isVowels(ch2)){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else if(!isVowels(ch1)){
                i++;
            }else if(!isVowels(ch2)){
                j--;
            }
        }
    return new String(arr);
    }
}