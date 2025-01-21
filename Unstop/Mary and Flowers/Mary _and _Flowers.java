import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    public static int[] find(int[] arr,int target,int total)
    {
        for(int i=0;i<total;i++)
        {
            for(int j=i+1;j<total;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[total];
        for(int i=0;i<total;i++)
        arr[i] = sc.nextInt();
        int[] result = find(arr,target,total);
        if(result!=null)
        System.out.print(result[0]+" "+result[1]);
        else
        System.out.print("null");       
        sc.close();
    }
}
