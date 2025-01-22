import java.util.Scanner;

public class ReplaceAndCountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        String modifiedString = str.replaceAll("[aeiouAEIOU]", "@")
                                     .replaceAll("[a-zA-Z&&[^aeiouAEIOU]]", "\\$")
                                     .replaceAll("\\d", "@ ");

        System.out.println("Modified string: " + modifiedString);
    }
}
