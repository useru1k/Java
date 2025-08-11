// https://codeforces.com/problemset/problem/158/A

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int current = a[p-1];
        if(current == 0) {
            int c = 0;
            for(int i=0;i<p;i++) {
                if(a[i] != 0) {
                    c++;
                }
            }
            System.out.println(c);
        }
        else {
            int count = 0;
            for(int i=p;i<n;i++) {
                if(a[i] == current) {
                    count++;
                }
            }
            System.out.println(p+count);
        }
        sc.close();
    }
}
