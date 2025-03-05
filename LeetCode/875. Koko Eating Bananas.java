class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int lower = 1 , higher = max;
        while(lower<higher)
        {
            int mid = (lower + higher) / 2;
            int i = 0;
            int eat = 0;
            while(i<piles.length)
            {
                eat += Math.ceil((double)piles[i]/mid);
                i++;
            }
        // System.out.println(eat + " " + mid);
            if(eat <= h)
            higher = mid;
            else
            lower = mid+1;
        }
        return lower; 
    }
}
