import java.util.Scanner;

public class tergol3_part3 {
    public static void main(String[] args) {
        // page 22
        // Q1
//        Scanner scanner = new Scanner(System.in);
//
//        // שלב 1: קלט מספר K
//        System.out.print("Enter target sum (k): ");
//        int k = scanner.nextInt();
//
//        // שלב 2: קלט 10 מספרים ושמירה במערך
//        int[] numbers = new int[10];
//        System.out.println("Enter 10 integers:");
//        for (int i = 0; i < 10; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//
//        // שלב 3: חיפוש שני מספרים שסכומם הוא K
//        boolean found = false;
//        for (int i = 0; i < 10; i++) {
//            for (int j = i + 1; j < 10; j++) {
//                if (numbers[i] + numbers[j] == k) {
//                    System.out.println("Found: " + numbers[i] + " + " + numbers[j] + " = " + k);
//                    found = true;
//                    break;
//                }
//            }
//            if (found) break;
//        }
//
//        // שלב 4: אם לא נמצא זוג מתאים
//        if (!found) {
//            System.out.println("No such pair exists");
//        }

        // Q2
//        Scanner scanner = new Scanner(System.in);
//        int[] input = new int[10];
//
//        System.out.println("Enter 10 integers:");
//        for (int i = 0; i < 10; i++) {
//            input[i] = scanner.nextInt();
//        }
//
//        System.out.println("Numbers without duplicates:");
//        for (int i = 0; i < 10; i++) {
//            boolean alreadyPrinted = false;
//
//            // בדיקה אם המספר כבר הופיע קודם
//            for (int j = 0; j < i; j++) {
//                if (input[i] == input[j]) {
//                    alreadyPrinted = true;
//                    break;
//                }
//            }
//
//            // אם לא הודפס קודם – נדפיס עכשיו
//            if (!alreadyPrinted) {
//                System.out.print(input[i] + " ");
//            }
//        }
//
//        System.out.println();

        // Q3
        Scanner scanner = new Scanner(System.in);

        // קלט מחרוזות
        System.out.print("Enter s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter s2: ");
        String s2 = scanner.nextLine();

        System.out.print("Enter s3: ");
        String s3 = scanner.nextLine();

        // מערכים בגודל 26 (לאותיות a–z)
        boolean[] inS1 = new boolean[26];
        boolean[] inS2 = new boolean[26];
        boolean[] inS3 = new boolean[26];

        // סימון האותיות שמופיעות בכל מחרוזת
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch < 'a' || ch > 'z') {
                System.out.println("Error: s1 must contain only lowercase letters (a-z)");
                return;
            }
            inS1[ch - 'a'] = true;
        }


        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (ch < 'a' || ch > 'z') {
                System.out.println("Error: s2 must contain only lowercase letters (a-z)");
                return;
            }
            inS2[ch - 'a'] = true;
        }


        for (int i = 0; i < s3.length(); i++) {
            char ch = s3.charAt(i);
            if (ch < 'a' || ch > 'z') {
                System.out.println("Error: s3 must contain only lowercase letters (a-z)");
                return;
            }
            inS3[ch - 'a'] = true;
        }


        // הדפסת אותיות שמופיעות גם ב-s1 וגם ב-s2 אך לא ב-s3
        System.out.print("Output: ");
        for (int i = 0; i < 26; i++) {
            if (inS1[i] && inS2[i] && !inS3[i]) {
                System.out.print((char)(i + 'a'));
            }
        }
        System.out.println();
    }
}
