import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = {5,4,3,2,1};
        int count = 0;
        int i = 0;
        while(i<a.length && n != 0) {
            if(a[i] <= n) {
                count++;
                n=n-a[i];
            }
            else {
                i++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
