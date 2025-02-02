class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> list1 = new ArrayList<>();
        int top = 0 , left = 0 , right = col - 1, bottom = row - 1;
        while(top<=bottom && left <=right)
        {
            for(int i=left;i<=right;i++)
            list1.add(matrix[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
            list1.add(matrix[i][right]);
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                list1.add(matrix[bottom][i]);
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                list1.add(matrix[i][left]);
                left++;
            }
        }
        return list1;
    }
}
