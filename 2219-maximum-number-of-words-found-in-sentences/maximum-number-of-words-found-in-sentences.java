class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(String s : sentences){
            int count = 1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == ' '){
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}

// class Solution {
//     public int mostWordsFound(String[] sentences) {
//         int n = sentences.length;
//         int Maximum = 0;
//         for(int i =0;i<n;i++){
//             int current_max = sentences[i].split(" ").length;
//             if(current_max > Maximum){
//                 Maximum = current_max;
//             }
//         }
//         return Maximum;
//     }
// }