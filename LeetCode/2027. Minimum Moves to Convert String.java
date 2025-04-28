class Solution {
    public int minimumMoves(String s) {
        // If no X have means 0 moves
        int x = s.indexOf('X');
        if(x == -1) 
        return 0;

        // Fixed Window size to move +3
        int step = 0;
        int i = 0;
        while(i<s.length())
        {
            if(s.charAt(i) == 'X')
            {
                i = i + 3;
                step++;
            }
            else
            i++;
        }
        return step;
    }
}
