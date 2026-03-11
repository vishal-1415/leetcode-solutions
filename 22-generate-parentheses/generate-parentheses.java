class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output_List = new ArrayList<>();
        backtracking(output_List, "", 0, 0, n);
        return output_List;
    }

    public void backtracking(List<String> output_List,String curr_string ,int open,int close,int max){
        if(curr_string.length() == max*2){
            output_List.add(curr_string);
            return;
        }

        if(open < max) backtracking(output_List,curr_string + "(",open+1,close,max);
        if(close < open) backtracking(output_List,curr_string + ")" ,open,close+1,max);
    }
}