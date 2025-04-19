import java.util.Scanner;

public class tergol2part2 {
    public static void main(String[] args) {
//        page17:
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a 5-digit number: ");
//        int number = input.nextInt();
//
//        // Check if it's a valid 5-digit number
//        if (number < 10000 || number > 99999) {
//            System.out.println("Invalid number. Please enter exactly 5 digits.");
//            return;
//        }
//
//        // Create an array to hold the 5 digits
//        int[] digits = new int[5];
//
//        // Fill the array from right to left
//        for (int i = 4; i >= 0; i--) {
//            digits[i] = number % 10;
//            number /= 10;
//        }
//
//        // Print the array from left to right
//        System.out.println("Digits in the number:");
//        for (int i = 0; i < 5; i++) {
//            System.out.print(digits[i] + " ");
//        }
//
//        input.close();

        //2
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a positive number: ");
//        int number = input.nextInt();
//
//        if (number <= 0) {
//            System.out.println("Invalid number. Please enter a positive number.");
//            return;
//        }
//
//        // Convert number to String to get the number of digits
//        String numberStr = String.valueOf(number);
//        int length = numberStr.length();
//
//        // Create array to store digits
//        int[] digits = new int[length];
//
//        // Fill the array with digits from left to right
//        for (int i = 0; i < length; i++) {
//            digits[i] = numberStr.charAt(i) - '0'; // Convert char to int
//        }
//
//        // Print each digit
//        System.out.println("Digits in the number:");
//        for (int i = 0; i < length; i++) {
//            System.out.print(digits[i] + " ");
//        }
//
//        input.close();

        // page 19
        // arr and string
        Scanner input = new Scanner(System.in);

        // First array
        System.out.print("Enter size of first array: ");
        int size1 = input.nextInt();
        String[] array1 = new String[size1];

        System.out.println("Enter names for first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = input.next();
        }

        // Second array
        System.out.print("Enter size of second array: ");
        int size2 = input.nextInt();
        String[] array2 = new String[size2];

        System.out.println("Enter names for second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = input.next();
        }

        // Print common names (intersection)
        System.out.println("Common student names:");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                    break; // Avoid printing the same name multiple times if it appears more than once
                }
            }
        }

        input.close();
    }
}
