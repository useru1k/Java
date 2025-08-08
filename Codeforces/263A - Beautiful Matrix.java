// https://codeforces.com/problemset/problem/263/A

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int a[][] = new int[n][n];
        int find_i = 0,find_j = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1) {
                    find_i = i;
                    find_j = j;
                }
            }
        }
        System.out.println(Math.abs(find_j - 2) + Math.abs(find_i - 2));
        sc.close();
    }
}
