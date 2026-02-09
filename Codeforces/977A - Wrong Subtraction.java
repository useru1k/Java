// https://codeforces.com/problemset/problem/977/A
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        while(s!=0) {
            if(n%10 == 0) {
                n = n / 10;
            }
            else {
                n = n - 1;
            }
            s--;
        }
        System.out.println(n);
        sc.close();
    }
}
