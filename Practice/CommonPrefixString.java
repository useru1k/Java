// Write a function to find the longest common prefix string amongst an array of words. If there is no common prefix, 
// return an empty string "".

// For example:
// Input:
// words = ["butterfly", "butter", "button"]
// Output:
// "but"
// Explanation:
// The common prefix among all the input words is "but".
// Input:
// words = ["apple", "banana", "grape"]
// Output:
// ""
// Explanation:
// There is no common prefix among the input words.
// Constraints:

//     1 <= words.length <= 200
//     0 <= words[i].length <= 200
//     words[i] consists only of lower-case English letters.


import java.util.*;
public class CommonPrefixString
{
    static String commonPrefix(String str[])
    {
        if(str.length == 0)
        return "";
        String pre = str[0];
        for(int i=0;i<str.length;i++){
            while(str[i].indexOf(pre)!=0)
            {
                pre = pre.substring(0,pre.length()-1);
                if(pre.isEmpty())
                return "";
            }
        }
        return pre;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        // String pre = str[]
        System.out.println(commonPrefix(str));
    }
}
