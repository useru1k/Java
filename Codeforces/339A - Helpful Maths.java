// https://codeforces.com/problemset/problem/339/A

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st[] = sc.nextLine().split("\\+"); // We can not split + by direct so // this
        int one = 0, two = 0, three = 0;
        for(int i=0;i<st.length;i++) {
            if(st[i].equals("1")) one++;
            else if(st[i].equals("2")) two++;
            else three++;
        }
        int len = st.length;
        int current = 0;
        for(int i=0;i<one;i++) {
            if(len == i+1) {
                System.out.print("1");
            }
            else {
                System.out.print("1+");
            }
        }
        for(int i=0;i<two;i++) {
            if(len == ((i+1) + one)) {
                System.out.print("2");
            }
            else {
                System.out.print("2+");
            }
        }
        for(int i=0;i<three;i++) {
            if(len == (i+1) + one + two) {
                System.out.print("3");
            }
            else {
                System.out.print("3+");
            }
        }
        sc.close();
    }
}
