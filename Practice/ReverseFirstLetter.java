// Read a string and reverse it and capitalize the reversed first letter.

import java.util.Scanner;
public class ReverseFirstLetter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        for(int i=0;i<str.length;i++)
        {
            StringBuilder result = new StringBuilder(str[i]);
            String val = result.reverse().toString();
            String first = val.substring(0,1).toUpperCase();
            System.out.print(first+val.substring(1)+" ");
        }
    }
}
