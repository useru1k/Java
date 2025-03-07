class Solution {
    public int numberOfSubstrings(String s) {
        int i = 0, j = 0;
        int count[] = {0,0,0};
        int valid = 0;
        while(j<s.length())
        {
            count[s.charAt(j) - 'a']++;
            while(count[0] > 0 && count[1] > 0 && count[2] > 0)
            {
                valid += s.length() - j;
                count[s.charAt(i) - 'a']--;
                i++;
            }
            j++;
        }
        return valid;
    }
}
