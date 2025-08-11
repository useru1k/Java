// https://codeforces.com/problemset/problem/1/A

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        System.out.println((long)Math.ceil(n/(double)a) * (long)Math.ceil(m/(double)a));
        sc.close();
    }
}
