class Solution {
    public char ch;
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hash = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        }
        boolean flag = true;
        for(Map.Entry<Character,Integer> en : hash.entrySet())
        {
            if(en.getValue() == 1)
            {
                ch = en.getKey();
                flag = false;
                break;
            }
        }
        if(flag)
        return -1;

        return s.indexOf(ch);
    }
}
