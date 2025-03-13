package Q4;

import java.util.Scanner;

public class MinMaxDigit {
    public static void main(String[] args) {
        //Q4.4 SOL
        Scanner scanner = new Scanner(System.in);

        // Get input number from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int minDigit = 9; // Smallest possible digit
        int maxDigit = 0; // Largest possible digit

        while (number > 0) {
            int digit = number % 10;  // Extract last digit

            if (digit > maxDigit) {
                maxDigit = digit;
            }
            if (digit < minDigit) {
                minDigit = digit;
            }

            number /= 10;  // Remove last digit
        }

        System.out.println("Smallest digit: " + minDigit);
        System.out.println("Largest digit: " + maxDigit);
    }
}
