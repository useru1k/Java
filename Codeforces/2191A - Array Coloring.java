import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            // Core Idea - If the adjecent side of the array has same digit like odd or even = No
            // If rearrange means the adjecent position has a same color.
            boolean flag = false;
            for(int i=0;i<n-1;i++) {
                if((a[i]%2==0 && a[i+1]%2==0) || (a[i]%2==1 && a[i+1]%2==1)) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
