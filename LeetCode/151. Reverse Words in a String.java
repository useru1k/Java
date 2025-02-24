class Solution {
    public String reverseWords(String s) {
        String result = "";
        s = s.trim();
        // s = s.replaceAll("//s+"," ");
        String str[] = s.split("\\s+");
        for(int i=str.length-1;i>=0;i--)
        {
            if(i==0)
            result = result + str[i].trim();
            else
            result = result + str[i].trim() + " ";
        }
        return result;
    }
}
