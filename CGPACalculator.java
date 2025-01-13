import java.util.*;
import java.lang.*;

public class CGPACalculator {
  public static void main(String[] args) {

    System.out.println("Grade to Point Conversion Table:");
    System.out.println("O : 10");
    System.out.println("A+: 9");
    System.out.println("A : 8");
    System.out.println("B+: 7");
    System.out.println("B : 6");
    System.out.println("C+: 5");
    System.out.println("C : 4");
    System.out.println("D : 0");
    System.out.println("UA : 0");

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number of Subjects: ");
    int number_of_subject = sc.nextInt();

    double totalGradePoint = 0;
    double totalCredits = 0;

    for(int i=1;i<=number_of_subject;i++){
      //System.out.print("Subject"+i+": ");
      //String Subject_name = sc.next();
      System.out.print("Enter grade (on a scale of 0 to 10): ");
      double grade = sc.nextDouble();
      System.out.print("Enter a Subject Credits: ");
      double credit = sc.nextDouble();
      totalGradePoint += grade * credit;
      totalCredits += credit;
    }

    if(totalCredits > 0)
    {
      double cgpa = totalGradePoint / totalCredits;
      System.out.printf("\nYour CGPA is: %.2f\n", cgpa);
    }
    else
    {
      System.out.println("\nTotal credits cannot be zero. Please check your inputs.");
    }

    sc.close();
  }
}

