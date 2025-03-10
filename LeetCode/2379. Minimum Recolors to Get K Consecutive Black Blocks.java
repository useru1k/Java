class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i = k;
        int count = 0;
        for(int m=0;m<k;m++)
        {
            if(blocks.charAt(m) == 'W')
            count++;
        }
        int min = count;
        while(i<blocks.length())
        {
            if(blocks.charAt(i-k) == 'W')
            count--;

            if(blocks.charAt(i) == 'W')
            count++;
            
            min = Math.min(min,count);
            i++;
        }
        return min;
    }
}
