class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            result[i] = sum;
        }

    return result;
    }
}