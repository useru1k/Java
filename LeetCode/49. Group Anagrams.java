class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hash = new HashMap<>();
        // Creating a HashMap to Store Value. 

        for(String word : strs)
        {
            char ch[] = word.toCharArray();
            Arrays.sort(ch);
            String newString = new String(ch);
            hash.putIfAbsent(newString,new ArrayList<>());
            hash.get(newString).add(word);
        }
        return new ArrayList<>(hash.values());
    }
}
