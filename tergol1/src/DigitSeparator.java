import java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args) {
        // Q3 Sol
        Scanner scanner = new Scanner(System.in);

        // Get a 6-digit number from the user
        System.out.print("Enter a 6-digit integer: ");
        int number = scanner.nextInt();

        // Convert the number to a string for easy digit extraction
        String numStr = Integer.toString(number);

        // Ensure the number has exactly 6 digits
        if (numStr.length() != 6) {
            System.out.println("Error: Please enter a 6-digit number.");
        } else {
            // Print each digit separated by a space
            for (int i = 0; i < numStr.length(); i++) {
                System.out.print(numStr.charAt(i) + " ");
            }
        }

        // Close scanner
        scanner.close();
    }
}
