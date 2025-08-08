// https://codeforces.com/problemset/problem/281/A

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
        sc.close();
    }
}
