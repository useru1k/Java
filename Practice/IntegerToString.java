public class IntToString {
    public static void main(String[] args) {
        int number = 12345;

        // Method 1: Using Integer.toString()
        String str1 = Integer.toString(number);
        System.out.println("Method 1: " + str1);

        // Method 2: Using String.valueOf()
        String str2 = String.valueOf(number);
        System.out.println("Method 2: " + str2);

        // Method 3: Using String.format()
        String str3 = String.format("%d", number);
        System.out.println("Method 3: " + str3);

        // Method 4: Concatenating with an empty string
        String str4 = number + "";
        System.out.println("Method 4: " + str4);

        // Method 5: Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        String str5 = sb.toString();
        System.out.println("Method 5: " + str5);
    }
}
