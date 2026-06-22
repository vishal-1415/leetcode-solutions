class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] freq_S = new int[26];
        int[] freq_Target = new int[26];

        for(char ch : s.toCharArray()){
            freq_S[ch - 'a']++;
        }
        for(char ch : target.toCharArray()){
            freq_Target[ch - 'a']++;
        }

        int copies = Integer.MAX_VALUE;

        for(int i = 0;i < 26;i++){

            if(freq_Target[i] > 0){
                int avaiable = freq_S[i] / freq_Target[i] ;
                copies = Math.min(copies,avaiable);
            }

        }

    return copies;
    }
}