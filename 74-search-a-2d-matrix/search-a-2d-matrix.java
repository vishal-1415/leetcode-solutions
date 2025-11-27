class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i =0;i<matrix.length;i++){
        int start =0;
        int end = matrix[i].length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<matrix[i][mid]){
                end = mid-1;
            }else if(matrix[i][mid]<target){
                start = mid+1;
            }else{
                return true;
            }
        }

            }
                return false;
    }
}