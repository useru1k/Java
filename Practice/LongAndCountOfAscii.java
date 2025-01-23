import java.util.*;
public class LongAndCountOfAscii 
{
    public static int calAscii(String str)
    {
        int sum = 0;
        for(char ch : str.toCharArray())
        {
            int val = (int)ch;
            sum = sum + val;
        }
        return sum;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        String longstr = "";
        for(int i=0;i<str.length;i++)
        {
            if(str[i].length()>longstr.length())
            longstr = str[i];
        }
        int max = 0;
        for(String st : str)
        {
            int coun = calAscii(st);
            if(max<coun)
            max = coun;
        }
        System.out.println(longstr);
        System.out.println(max);
    }
}
