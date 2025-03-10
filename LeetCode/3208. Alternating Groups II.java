class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int N = colors.length;
        int l = 0;
        int r = 1;
        int count = 0;
        while(r < N + k - 1)
        {
            if(colors[r % N] == colors[(r - 1) % N])
            l = r;

            if(r - l + 1 > k)
            l++;

            if(r - l + 1 == k)
            count++;

            r++;
        }
        return count;
    }
}
