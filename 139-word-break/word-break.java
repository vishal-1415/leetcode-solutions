class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> Wordset = new HashSet<>(wordDict);
        int maxLen = 0;
        //maximum length of words in wordDict
        for(String word:wordDict){
            maxLen = Math.max(maxLen,word.length());
        }
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        for(int i = 1;i<=n;i++){
            for(int j = 0;j<i;j++){
                String temp = s.substring(j,i);
                if(dp[j] && Wordset.contains(temp)){
                    dp[i] = true;
                    break;
                }
            }
        }
    return dp[n];
    }
}