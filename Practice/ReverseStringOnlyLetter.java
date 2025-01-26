// Read a string and reverse only a letter 
// Eg I* Am Not String - g* no rtS toNmAI

import java.util.Scanner;
public class ReverseStringOnlyLetter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int i = 0 , j = ch.length-1;
        while(i<j)
        {
            if(!((ch[i]>='a'&&ch[i]<='z') || (ch[i]>='A'&&ch[i]<='Z')))
            {
                i++;
            }
            else if(!((ch[j]>='a'&&ch[j]<='z')||(ch[j]>='A' && ch[j]<='Z')))
            {
                j--;
            }
            else{
                char tem = ch[i];
                ch[i]=ch[j];
                ch[j]=tem;
                i++;
                j--;
            }
            // if(((ch[i]>='a'&&ch[i]<='z') || (ch[i]>='A'&&ch<='Z'))
            // && ((ch[j]>='a'&&ch[j]<='z')||(ch[j]>='A' && ch[j]<='Z')))
        }
        for(int m=0;m<ch.length;m++)
        System.out.print(ch[m]);
    }
}
