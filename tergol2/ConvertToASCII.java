import java.util.Objects;
import java.util.Scanner;

public class ConvertToASCII {
    public static void main(String[] args)
    {
//        int asciiValue = (int) 'b';
//        System.out.println("ASCII value of 'b' is: " + asciiValue);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String str = input.next();
//        System.out.println("the string is " + str);
//
//        input.close();

        // convert string to ASCII values






        // print ASCII values of all lowercase alphabets
//        for(char let='a'; let <= 'z' ; let++) {
//            // convert to ASCII
//            int asciiValue = (int) let;
//            System.out.println("ASCII value of '" + let + "' is: " + asciiValue);
//        }

//        // HOW to use Scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String input = scanner.nextLine();
//        System.out.println("You entered " + input);
//        scanner.nextLine();
//        scanner.close();

        // check if the input is int
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//
//        if(scanner.hasNextInt()) {
//            System.out.println("You enter an integer");
//        } else {
//            System.out.println("You entered a non-integer");
//        }
//        scanner.close();

//        String s1,s2,s3;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter s1: ");
//        s1 = scanner.next();
//        System.out.println("Enter s2: ");
//        s2 = scanner.next();
//        System.out.println("Enter s3: ");
//        s3 = scanner.next();
//        System.out.print(s1 + " " );
//        System.out.print(s2 + " " );
//        System.out.print(s3 + " " );
//
////        System.out.println(s1 + " " + s2 + " " + s3);
//        scanner.close();
    Scanner scanner = new Scanner(System.in);
//    int count = 5;
//    for (int i = 0; i < count; i++)
//    {
//        System.out.println("Enter string " + (i + 1) + ": ");
//        String s = scanner.next();
//
//        System.out.println("You entered: " + s);
//
//    }
//        int count = 0;
//        while (count < 5) {
//            System.out.println("Enter string " + (count + 1) + ": ");
//            String s = scanner.next();
//
//            System.out.println("You entered: " + s);
//
//            count++;
//        }
        int count = 0;
        int count1 = 0;
        while (count < 5) {
            System.out.println("Enter string " + (count + 1) + ": ");
            String s = scanner.next();
            System.out.println("Enter Number " + (count + 1) + ": ");
            int number = scanner.nextInt();
            count1=count1 + number;
            if(s.equals("abc")){
                System.out.println("Pingo");
                break;
            }
            System.out.println("You entered: " + s);

            count++;
        }
        System.out.println("Sum of numbers: " + count1);
        // sqrt of count1
        System.out.println("Square root of sum: " + Math.sqrt(count1));

    scanner.close();}
}
