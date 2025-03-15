public class Methods {

    // שאלה 1: סכום הספרות במיקומים זוגיים ואי-זוגיים
    public void sumEvenOddPositions(int num) {
        int sumEven = 0, sumOdd = 0;
        int position = 1;

        while (num > 0) {
            int digit = num % 10;
            if (position % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            num /= 10;
            position++;
        }

        System.out.println("Sum of digits in even positions: " + sumEven);
        System.out.println("Sum of digits in odd positions: " + sumOdd);
    }

    // שאלה 2: מחיקת תווים ממחרוזת
    public String removeCharacter(String s, char ch) {
        return s.replace(String.valueOf(ch), "");
    }

    // שאלה 3: סכום המספרים המשותפים
    public int sumCommonNumbers(int[] array1, int[] array2) {
        int sum = 0;
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    sum += num1;
                    break;
                }
            }
        }
        return sum;
    }

    // שאלה 4: ספרות חוזרות
    public void findCommonDigits(int num1, int num2) {
        boolean[] digits1 = new boolean[10];
        boolean[] digits2 = new boolean[10];

        while (num1 > 0) {
            digits1[num1 % 10] = true;
            num1 /= 10;
        }

        while (num2 > 0) {
            digits2[num2 % 10] = true;
            num2 /= 10;
        }

        System.out.print("Common digits: ");
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (digits1[i] && digits2[i]) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        } else {
            System.out.println();
        }
    }

    // שאלה 5: המילה שמופיעה הכי הרבה פעמים במשפט
    public void mostFrequentWord(String s) {
        String[] words = s.split(" ");
        String mostFrequent = "";
        int maxCount = 0;

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = words[i];
            }
        }

        System.out.println("Most frequent word: " + mostFrequent + " (" + maxCount + " times)");
    }

    // שאלה 6: מספר הפעמים שכל ספרה מופיעה במספר
    public void countDigitOccurrences(int num) {
        int[] count = new int[10];

        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println("Digit " + i + " appears " + count[i] + " times");
            }
        }
    }

    // שאלה 7: מספר המופעים של כל מספר במערך
    public void countArrayOccurrences(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            System.out.println("Number " + array[i] + " appears " + count + " times");
        }
    }
}
