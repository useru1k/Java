// https://codeforces.com/problemset/problem/112/A

    import java.util.Scanner;
    public class Main {
        public static int checkingOrder(String s1,String s2) {
            for(int i=0;i<s2.length();i++) {
                if(s1.charAt(i) == s2.charAt(i)) {
                    continue;
                }
                else if(s1.charAt(i) < s2.charAt(i)) {
                    return -1;
                }
                else if(s1.charAt(i) > s2.charAt(i)) {
                    return 1;
                }
            }
            return 0;
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String str_1 = sc.nextLine().toLowerCase();
            String str_2 = sc.nextLine().toLowerCase();
            System.out.println(checkingOrder(str_1,str_2));
        }
    }
