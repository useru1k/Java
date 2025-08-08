// https://codeforces.com/contest/118/problem/A

import java.util.Scanner;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().toLowerCase();
        String vowels = "AEIYOUaeyiou";
        for(int i=0;i<st.length();i++) {
            char ch = st.charAt(i);
            if(vowels.contains(String.valueOf(ch))) {
                continue;
            }
            else {
                System.out.print("." + ch);
            }
        }
        sc.close();
    }
}
