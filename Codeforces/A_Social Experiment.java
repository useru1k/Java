// Problem Link: https://codeforces.com/contest/2184/problem/A
// Profile: https://codeforces.com/profile/bluecapture_
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            if(n <= 3) {
                System.out.println(n);
            }
            else if(n%2==0) {
                System.out.println(0);
            }
            else {
                System.out.println(1);
            }
        }
        sc.close();
    }
}
