class Solution {
    public int maxNumberOfBalloons(String text) {
        String target = "balloon";
        int[] freq_text = new int[26];
        int[] freq_Target = new int[26];

        for(char ch : text.toCharArray()){
            freq_text[ch - 'a']++;
        }
        for(char ch : target.toCharArray()){
            freq_Target[ch - 'a']++;
        }

        int copies = Integer.MAX_VALUE;

        for(int i = 0;i < 26;i++){

            if(freq_Target[i] > 0){
                int avaiable = freq_text[i] / freq_Target[i] ;
                copies = Math.min(copies,avaiable);
            }

        }

    return copies;
    }
}