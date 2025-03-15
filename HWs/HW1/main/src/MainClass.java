import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        boolean exit = false;

        // בדיקות לשאלות 1-7
        System.out.println("Testing Questions 1-7:");

        // שאלה 1 - סכום הספרות במיקומים זוגיים ואי-זוגיים
        System.out.print("Enter a number for sumEvenOddPositions: ");
        int num1 = scanner.nextInt();
        methods.sumEvenOddPositions(num1);

        // שאלה 2 - מחיקת תו ממחרוזת
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.print("Enter a character to remove: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Modified string: " + methods.removeCharacter(str, ch));

        // שאלה 3 - סכום המספרים המשותפים במערכים
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        System.out.println("Sum of common numbers: " + methods.sumCommonNumbers(array1, array2));

        // שאלה 4 - ספרות חוזרות
        System.out.print("Enter two numbers to check for common digits: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        methods.findCommonDigits(n1, n2);

        // שאלה 5 - המילה הנפוצה ביותר במשפט
        scanner.nextLine(); // ניקוי הקלט
        System.out.print("Enter a sentence for mostFrequentWord: ");
        String sentence = scanner.nextLine();
        methods.mostFrequentWord(sentence);

        // שאלה 6 - ספירת מספר הפעמים שכל ספרה מופיעה במספר
        System.out.print("Enter a number for countDigitOccurrences: ");
        int num2 = scanner.nextInt();
        methods.countDigitOccurrences(num2);

        // שאלה 7 - ספירת כמות ההופעות של מספרים במערך
        int[] numbersList = {5, 2, 2, 8, 5, 5, 9};
        System.out.println("Occurrences in array:");
        methods.countArrayOccurrences(numbersList);

        // קליטת 10 מספרים ושמירתם במערך
        int[] numbers = new int[10];
        System.out.println("Please enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // תפריט בחירה
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Multiply all numbers divide by sum");
            System.out.println("2. Most frequent number in the array");
            System.out.println("3. Print all numbers in reverse order");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Multiply and divide by sum is: " + multiplyAndDivide(numbers));
                    break;
                case 2:
                    System.out.println("Most frequent number: " + findMostFrequent(numbers));
                    break;
                case 3:
                    printReverse(numbers);
                    break;
                case 4:
                    System.out.println("Bye Bye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please select again.");
            }
        }

        scanner.close();
    }

    // חישוב מכפלת המספרים חלקי סכומם
    public static double multiplyAndDivide(int[] numbers) {
        long product = 1;
        int sum = 0;
        for (int num : numbers) {
            product *= num;
            sum += num;
        }
        return (double) product / sum;
    }

    // מציאת המספר שמופיע הכי הרבה פעמים
    public static int findMostFrequent(int[] numbers) {
        int maxCount = 0;
        int mostFrequent = numbers[0];

        for (int num : numbers) {
            int count = 0;
            for (int n : numbers) {
                if (n == num) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = num;
            }
        }
        return mostFrequent;
    }

    // הדפסת המספרים בסדר הפוך
    public static void printReverse(int[] numbers) {
        System.out.print("Numbers in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
