import java.util.*;

public class Main {
    public static int userLogic(int n, int x, String s) {
        // Write your logic here.
        // Parameters:
        //     n (int): Length of the string
        //     x (int): Initial position
        //     s (String): String representing the robot's movements
        // Returns:
        //     int: Number of distinct points visited by the robot
        HashSet<Integer> h1 = new HashSet<Integer>();
        h1.add(x);
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == 'R')
            {
                x++;
                h1.add(x);
            }
            else if(s.charAt(i) == 'L')
            {
                x--;
                h1.add(x);
            }
        }
        return h1.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<Integer> results = new ArrayList<>();
        
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            String s = scanner.next();
            int result = userLogic(n, x, s);
            results.add(result);
        }
        
        for (int result : results) {
            System.out.println(result);
        }
    }
}
