//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Define three variables: one integer and two floating-point numbers
        int intNumber = 5;
        double floatNumber1 = 4.2;
        double floatNumber2 = 3.8;

        // Compute the product of the three numbers
        double product = intNumber * floatNumber1 * floatNumber2;

        // Compute the average of the three numbers
        double average = (intNumber + floatNumber1 + floatNumber2) / 3.0;

        // Find the largest number among the three
        double maxNumber = Math.max(intNumber, Math.max(floatNumber1, floatNumber2));

        // Compute the remainder of the division between the two floating-point numbers
        double remainder = floatNumber1 % floatNumber2;

        // Print results
        System.out.println("Product of the three numbers: " + product);
        System.out.println("Average of the three numbers: " + average);
        System.out.println("Largest number among the three: " + maxNumber);
        System.out.println("Remainder of division between two floating-point numbers: " + remainder);
    }
}