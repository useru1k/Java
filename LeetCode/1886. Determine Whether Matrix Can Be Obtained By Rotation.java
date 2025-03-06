class Solution {
    public static void rotate(int[][] mat)
    {
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<i;j++)
            {
                int tem = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tem;
            }
        }
        int k = 0;
        while(k<row)
        {
            int i = 0, j = col-1;
            while(i<j)
            {
                int tem = mat[k][i];
                mat[k][i] = mat[k][j];
                mat[k][j] = tem;
                i++;
                j--;
            }
            k++;
        }
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        if(Arrays.deepEquals(mat,target))
        return true;
        int n = 3;
        while(n>0)
        {
            rotate(mat);
            if(Arrays.deepEquals(mat,target))
            return true;
            n--;
        }
        return false;
    }
}
