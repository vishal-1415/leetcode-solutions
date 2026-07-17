class Solution {
    public boolean checkValid(int[][] matrix) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                int num = matrix[i][j];
                if(!set.add(num + " in Row" + i) || 
                    !set.add(num + " in Column" + j)){
                        return false;
                    }
            }
        }
    return true;
    }
}