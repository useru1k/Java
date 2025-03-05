class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int low = 0, high = (row * col) - 1;
        int i = 0 , j = 0;
        while(low<=high)
        {
            int mid = low + (high-low) /2;
            i = mid / col;
            j = mid % col;
            if(matrix[i][j] == target)
            return true;
            else if (matrix[i][j] < target)
            {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }    
        return false; 
    }
}
