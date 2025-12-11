import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Integer,Integer> set = new HashMap<>();
        boolean flag = true;
        int nn = sc.nextInt();
        int mm = sc.nextInt();
        set.put(nn,(nn+mm));
        
        for (int i=0;i<t-1;i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int check = set.get(n+m) == null ? 0 : set.get(n+m);
            set.put(n,(n+m));
            if(check == n) {
                System.out.println("YES");
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("NO");
        }
        sc.close();
    }
}
