// Link: https://codeforces.com/problemset/problem/520/A
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String st = sc.nextLine().toLowerCase();
        if(n<26) {
            System.out.println("NO");
        }
        else {
            int check[] = new int[26];
            for(int i=0;i<st.length();i++) {
                check[st.charAt(i) - 'a']++;
            }
            boolean flag = true;
            for(int i=0;i<26;i++) {
                if(check[i] == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
