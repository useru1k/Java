import java.util.Scanner;
public class ProA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            int left = a[0];
            int count = 0;
            for(int i=1;i<n;i++) {
                if(a[i] < left) {
                    count++;
                }
                else {
                    left = a[i];
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
