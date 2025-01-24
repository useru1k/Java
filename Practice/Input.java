import java.util.Scanner;
public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Integer : ");
    int num = sc.nextInt();
    // Geting a Input as a Integer.

    System.out.print("Enter a Character : ");
    char ch = sc.next().charAt(0);
    
    System.out.print("Enter a String : ");
    String str = sc.next();
    sc.nextLine();

    System.out.print("Enter a String a Full Line : ");
    String str_full = sc.nextLine();

    System.out.print("Enter a Double value : ");
    double d = sc.nextDouble();

    System.out.print("Enter a Boolean value : ");
    boolean b = sc.nextBoolean();
    

    System.out.println("Integr : "+num);
    System.out.println("Character : "+ch);
    System.out.println("String One word : "+str);
    System.out.println("String Full line :"+str_full);
    System.out.println("Double : "+d);
    System.out.println("Boolean : "+b);
  }
}
