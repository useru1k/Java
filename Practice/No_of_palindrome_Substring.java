import java.util.Scanner;
public class No_of_palindrome_Substring 
{
    static boolean isPal(String str,int i,int j)
    {
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static int find(String str)
    {
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(isPal(str,i,j))
                count++;
            }
        }
        return count;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(find(str));
    }
}
