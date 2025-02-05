class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int f = -1, s = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (f == -1) {
                    f = i;
                } else {
                    s = i;
                }
            }
        }

        if (count == 0) return true; 
        if (count > 2) return false; 

        return count == 2 && s1.charAt(f) == s2.charAt(s) && s1.charAt(s) == s2.charAt(f);
    }
}
