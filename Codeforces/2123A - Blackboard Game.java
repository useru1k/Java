// https://codeforces.com/problemset/problem/2123/A

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            // a + b = 3 (mod 4) 
            if(n % 4 == 0) {
                System.out.println("Bob");
            }
            else {
                System.out.println("Alice");
            }
        }
        sc.close();
    }
}
