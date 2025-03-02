class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0;
        int hash[] = new int[128];
        Arrays.fill(hash, -1);
        while(j<s.length())
        {
            int n = s.charAt(j);
            if(hash[n] >= i)
            {
                i = hash[n]+1;
            }
            hash[n] = j;
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
