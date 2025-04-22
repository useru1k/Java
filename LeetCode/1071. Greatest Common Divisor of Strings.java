class Solution {
    public boolean check(int n,String str1,String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();

        if(len1 % n != 0 || len2 % n != 0)
        return false;

        int f1 = len1 / n;
        int f2 = len2 / n;

        return str2.substring(0,n).repeat(f1).equals(str1) && str2.substring(0,n).repeat(f2).equals(str2);

    }
    public String gcdOfStrings(String str1, String str2) {
        for(int i=Math.min(str1.length(),str2.length());i>0;i--)
        {
            if(check(i,str1,str2))
                return str1.substring(0,i);
        }
        return "";
    }
}
