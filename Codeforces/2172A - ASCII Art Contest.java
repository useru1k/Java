import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ai = new ArrayList<>();
        for(int i=0;i<3;i++) {
            ai.add(sc.nextInt());
        }
        Collections.sort(ai);
        // System.out.println(ai);
        int min = ai.get(0);
        int avg = ai.get(1);
        int max = ai.get(2);
        if((max - min) < 10) {
            System.out.println("final " + avg);
        }
        else {
            System.out.println("check again");
        }
        sc.close();
    }
}
