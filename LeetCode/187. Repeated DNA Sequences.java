class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result = new HashSet<>();
        HashSet<String> came = new HashSet<>();
        int i = 0;
        while(i <= s.length() - 10)
        {
            String sub = s.substring(i,i+10);
            if(came.contains(sub))
            result.add(sub);
            came.add(sub);
            i++;
        }
        return new ArrayList(result);
    }
}
