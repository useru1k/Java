import java.util.*;
public class Histogram
{
    public static void main(String[] arsg)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String in = str.replaceAll("[\\[\\]]","");
        String st[] = in.split(",");
        int a[] = new int[st.length];
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        for(int i=0;i<st.length;i++)
        {
            a1.add(Integer.parseInt(st[i]));
            a[i] = Integer.parseInt(st[i]);
            // System.out.print(a[i]+" ");
        }
        int res = 0,max = 0;
        for(int i=0;i<a.length;i++)
        {
            int cr = a[i];
            if(i>0)
            {
                for(int j=i-1;j>=0 && a[j]>=a[i];j--)
                cr += a[i];
            }
            for(int j=i+1;j<a.length && a[j]>=a[i];j++)
            cr += a[i];
            
            if(res < cr)
            res = cr;
        }
        // System.out.println(a1);
        System.out.println(res);
    }
}
