import java.util.Scanner;

public class tergol3_part2 {
    public static void main(String[] args) {
        // page 21
        // Q1
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[5]; // לשמירת 5 המספרים האחרונים
//        int count = 0;
//
//        System.out.println("הכנס מספרים שלמים (הכנס -1 כדי לעצור):");
//
//        while (true) {
//            int number = scanner.nextInt();
//
//            if (number == -1) {
//                break; // עצירה כשהמשתמש מקליד -1
//            }
//
//            if (count < 5) {
//                numbers[count] = number;
//                count++;
//            } else {
//                // אם כבר יש 5 – זורקים את הישן ביותר ומכניסים את החדש
//                for (int i = 0; i < 4; i++) {
//                    numbers[i] = numbers[i + 1];
//                }
//                numbers[4] = number;
//            }
//        }
//
//        // הדפסה
//        System.out.println("5 המספרים האחרונים שהוזנו:");
//        for (int i = 0; i < count; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }

        // Q2
//        Scanner scanner = new Scanner(System.in);
//        boolean[] found = new boolean[26]; // כל אות מסומנת לפי אינדקס
//
//        System.out.println("Enter capital letters (A–Z):");
//        String input = scanner.nextLine();
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//
//            if (ch >= 'A' && ch <= 'Z') {
//                int index = ch - 'A'; // ממפה את A ל-0, B ל-1, ..., Z ל-25
//                found[index] = true;
//            }
//        }
//
//        boolean allFound = true;
//        for (int i = 0; i < 26; i++) {
//            if (!found[i]) {
//                allFound = false;
//                break;
//            }
//        }
//
//        if (allFound) {
//            System.out.println("All letters found");
//        } else {
//            System.out.println("Missing letters");
//        }


        // Q3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with exactly 10 characters:");
        String input = scanner.nextLine();

        // בדיקה שהאורך בדיוק 10 תווים
        if (input.length() != 10) {
            System.out.println("Error: Input must be exactly 10 characters long.");
            return;
        }

        // הדפסת המחרוזת הפוך
        System.out.print("Reversed string: ");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

        System.out.println();
    }
}