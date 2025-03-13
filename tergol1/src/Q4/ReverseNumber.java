package Q4;
public class ReverseNumber {
    public static void main(String[] args) {
        //Q4.3 SOL
        int number = 3456789;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;  // Extract last digit
            reversed = reversed * 10 + digit;  // Build reversed number
            number /= 10;  // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
