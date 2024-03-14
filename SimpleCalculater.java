import java.util.*;
public class SimpleCalculater
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculater");
        System.out.println("Enter the First Number : ");
        double number1 = sc.nextDouble();
        System.out.println("Enter the Second Number : ");
        double number2 = sc.nextDouble();
        System.out.println("Enter the Operator (+,-,*,/,%) : ");
        char Operator = sc.next().charAt(0);
        sc.close();
        double output = 0;
        switch(Operator)
        {
            case '+':
                output = number1 + number2;
                break;
            case '-':
                output = number1 - number2;
                break;
            case '*':
                output = number1 * number2;
                break;
            case '/':
                if (number2 == 0)
                {
                    System.out.println("Error! Dividing Zero is not possible");
                }
                else
                {
                    output = number1 / number2;
                }
                break;
            case '%':
                output = number1 % number2;
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
        System.out.println(number1 + " " + Operator + " " + number2 + " = " + output);
      // End of the program
    }
}
