import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
           char[] st = sc.nextLine().toCharArray();
           boolean flag = true;
           HashSet<Character> set = new HashSet<>();
           for(int i=0;i<st.length;i++) {
               if(set.contains(st[i])) {
                   continue;
               }
               else {
                   set.add(st[i]);
               }
           }
           if(set.size() % 2 == 0) {
               System.out.println("CHAT WITH HER!");
           }
           else {
               System.out.println("IGNORE HIM!");
           }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
