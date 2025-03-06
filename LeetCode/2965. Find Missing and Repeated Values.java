class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // Calc the Row and Coloum Value
        int row = grid.length;
        int col = grid[0].length;
        // Make a bool array to maintain the Elements Like hashing method
        boolean check[] = new boolean[row*col+1];
        int duplicate = -1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(check[grid[i][j]])
                duplicate = grid[i][j];
                else
                check[grid[i][j]] = true;
            }
        }
        int missing = -1;
        for(int i=0;i<check.length;i++)
        {
            if(!check[i])
            missing = i;
        }
        return new int[]{duplicate,missing};
    }
}
