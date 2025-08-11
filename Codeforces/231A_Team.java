//  https://codeforces.com/problemset/problem/231/A

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();
       int a[][] = new int[n][n];
       int result = 0;
       for(int i=0;i<n;i++) {
           String s = sc.nextLine().replaceAll("[^1]","");
           if(s.length() >= 2) {
               result++;
           }
       }
       System.out.println(result);
       sc.close();
    }
}
