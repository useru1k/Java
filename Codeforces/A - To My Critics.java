import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int a[] = new int[3];
            int max = 0;
            int secMax = max;
            for(int i=0;i<3;i++) {
                a[i] = sc.nextInt();
                if(max < a[i]) {
                    secMax = max;
                    max = a[i];
                }
                else if((secMax < a[i] && max > a[i]) || (max == a[i])) {
                    secMax = a[i];
                }
            }
            // System.out.println(max + " " + secMax);
            if((max + secMax) >= 10) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
