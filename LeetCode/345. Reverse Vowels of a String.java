class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        String vowel = "AEIOUaeiou";
        char ch[] = s.toCharArray();
        while(i<j)
        {
            while(vowel.indexOf(String.valueOf(ch[i])) == -1 && i<j )
            {
                i++;
            } 
            while(vowel.indexOf(String.valueOf(ch[j])) == -1 && i<j )
            {
                j--;
            }
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i++;
            j--;
        }
        String result = "";
        for(char m : ch)
        result+=m;

        return result;
    }
}
