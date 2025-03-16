class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthese = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            parenthese.push(s.charAt(i));
            else{
                if(parenthese.isEmpty())
                {
                    return false;
                }
                char ch = parenthese.peek();
                if((ch == '(' && s.charAt(i) == ')') || (ch == '[' && s.charAt(i) == ']') || (ch == '{' && s.charAt(i) == '}'))
                {
                    parenthese.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(parenthese.isEmpty())
        return true;

        return false;
    }
}
