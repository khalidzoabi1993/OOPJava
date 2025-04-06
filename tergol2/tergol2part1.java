import java.util.Scanner;

public class tergol2part1 {
    public static void main(String[] args) {
//        // Print numbers between 1 and 100 divisible by 7
//        for (int i = 1; i <= 100; i += 7) {
//            System.out.println(i);
//        }
//        // with if statement
//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 == 0) {
//                System.out.println(i);
//            }
//        }
//        // Read 20 integers and print the average of even numbers
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < 20; i++) {
//            System.out.print("Enter number " + (i + 1) + ": ");
//            int number = scanner.nextInt();
//            if (number % 2 == 0) {
//                sum += number;
//                count++;
//            }
//        }
//        double average = (double) sum / count;
//        System.out.println("Average of even numbers: " + average);

        // Read integers until the first negative number (which is ignored)
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//        while (true) {
//            System.out.print("Enter number " + (count + 1) + " (negative to stop): ");
//            int number = scanner.nextInt();
//            if (number < 0) {
//                break;
//            }
//            if (number % 2 == 0) {
//                sum += number;
//                count++;
//            }
//        }
//        double average = (double) sum / count;
//        System.out.println("Average of even numbers: " + average);
//        scanner.close();

//        // 4 - After each number, ask the user if they want to continue
//        Scanner input = new Scanner(System.in);
//        int sum = 0, count = 0;
//
//        System.out.print("Do you want to enter a number? (y/n): ");
//        String answer = input.next();
//
//        while (answer.equals("y") || answer.equals("Y")) {
//            System.out.print("Enter a number: ");
//            int num = input.nextInt();
//
//            if (num % 2 == 0) {
//                sum += num;
//                count++;
//            }
//
//            System.out.print("Do you want to enter another number? (y/n): ");
//            answer = input.next();
//        }
//
//        if (count > 0)
//            System.out.println("Average of even numbers: " + (sum / count));
//        else
//            System.out.println("No even numbers entered.");
//
//        input.close();
        // 5 -Print day name based on number from 1 to 7
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 7: ");
//        int day = input.nextInt();
//
//        if (day == 1)
//            System.out.println("Sunday");
//        else if (day == 2)
//            System.out.println("Monday");
//        else if (day == 3)
//            System.out.println("Tuesday");
//        else if (day == 4)
//            System.out.println("Wednesday");
//        else if (day == 5)
//            System.out.println("Thursday");
//        else if (day == 6)
//            System.out.println("Friday");
//        else if (day == 7)
//            System.out.println("Saturday");
//        else
//            System.out.println("Invalid number. Must be between 1 and 7.");
//
//        input.close();
//        //6) Guess the number game with hints (too high / too low)
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Player 1, enter a number to be guessed: ");
//        int secret = input.nextInt();
//
//        System.out.println("Now Player 2 must guess the number!");
//
//        int guess = -1; // any value not equal to secret
//        while (guess != secret) {
//            System.out.print("Enter your guess: ");
//            guess = input.nextInt();
//
//            if (guess < secret)
//                System.out.println("Too small. Try again.");
//            else if (guess > secret)
//                System.out.println("Too big. Try again.");
//            else
//                System.out.println("Correct! You guessed the number.");
//        }
//
//        input.close();

        //7) Perfect number checker
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it's perfect: ");
        int num = input.nextInt();

        int sum = 0;
        System.out.print("Divisors: ");

        // Find and print divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println(); // move to next line
        System.out.println("Sum of divisors: " + sum);

        if (sum == num)
            System.out.println(num + " is a perfect number.");
        else
            System.out.println(num + " is not a perfect number.");

        input.close();
    }
}
