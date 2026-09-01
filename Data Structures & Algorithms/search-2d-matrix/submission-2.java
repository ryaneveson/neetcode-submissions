class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // this will get the length of n
        int ROWS = matrix.length;
        // this will get the depth m
        int COLS = matrix[0].length;
        int left = 0;
        //this formula will get the last value of the matrix if we are viewing it as a single array
        int right = ROWS * COLS -1;
        while(left <= right){
            int mid = left + ((right - left)/2);
            // convert the mid point that was found with the single array back in to the matrix format
            // divide the mid point by # of cols to get the row it should be in
            int row = mid / COLS;
            // get the remainder to find the location in the row (the col)
            int col = mid % COLS;
            // perform regular binary search logic here
            if(target > matrix[row][col]){
                left = mid +1;
            }else if( target < matrix[row][col]){
                right = mid - 1;
            }else if(target == matrix[row][col]){
                return true;
            }
        }
        return false;
    }
}
