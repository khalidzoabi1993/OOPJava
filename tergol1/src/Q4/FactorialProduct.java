package Q4;

public class FactorialProduct {
    public static void main(String[] args) {
        //Q4.2 SOL
        int a = 5, b = 7;

        // Compute factorial for both numbers
        long factorialA = factorial(a);
        long factorialB = factorial(b);

        // Compute and print the product
        long product = factorialA * factorialB;
        System.out.println(a + "! * " + b + "! = " + product);
    }

    // Function to calculate factorial
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
