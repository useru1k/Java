// https://codeforces.com/problemset/problem/282/A

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int result = 0;
        for(int i=0;i<n;i++) {
            String st = sc.nextLine();
            if(st.contains("++")) {
                result++;
            }
            else {
                result--;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
