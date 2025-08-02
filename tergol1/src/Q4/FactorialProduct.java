package Q4;

public class FactorialProduct {
    public static void main(String[] args) {
        //Q4.2 SOL
        int a = 5, b = 7;

        int resultA = 1;
        int resultB = 1;
        for (int i = 1; i <= a; i++) {
            resultA *= i;
        }
        for (int i = 1; i <= b; i++) {
            resultB *= i;
        }

        // Compute and print the product
        int product = resultA * resultB;
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
