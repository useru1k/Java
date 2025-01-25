// Read a Array and Need to find the max of the sum of the three number 
// where number ai < aj < ak so ai + aj + ak
// 0 <= i < j < k && ai < aj < ak 

import java.util.Scanner;
public class AddThreeNumberGreater
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
        
        int max = 0;
        for(int i=0;i<n;i++)
        {
            int sum = 0;
            int fr = a[i],sd=0,rd=0;
            for(int j=i+1;j<n;j++)
            {
                if(fr<a[j])
                {
                    sd = a[j];
                }
                for(int k=0;k<n;k++)
                {
                    if(sd < a[k])
                    {
                        rd = a[k];
                        sum = fr + sd + rd;
                        if(sum>max)
                        max = sum;
                    }
                }
            }
        }
        System.out.print(max);
    }
}
