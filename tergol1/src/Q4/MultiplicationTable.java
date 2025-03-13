package Q4;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Q4.1 sol
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t"); // Print multiplication result with a tab space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
