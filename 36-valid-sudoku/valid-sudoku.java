class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') { // the add method acts as boolean check, check in r,c and subboxes for duplicates
                    if (!set.add(ch + " found in Row " + i) ||
                            !set.add(ch + " found in Column " + j) ||
                            !set.add(ch + " found in SubBox " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}