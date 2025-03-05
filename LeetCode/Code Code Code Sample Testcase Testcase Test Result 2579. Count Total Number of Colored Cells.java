class Solution {
    public long coloredCells(int n) {
        
        long count = 1;
        long jump = 4;
        while(n>1)
        {
            count += jump;
            jump += 4;
            n--;
        }
        return count;
    }
}

// Math Formula : 1 + (long)(2 * (n * (n + 1)))
