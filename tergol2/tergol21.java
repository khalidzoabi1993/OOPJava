import java.util.Scanner;

public class tergol21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s1, s2, s3;
//        System.out.println("Enter s1: ");
//        s1 = scanner.next();
//        System.out.println("Enter s2: ");
//        s2 = scanner.next();
//        System.out.println("Enter s3: ");
//        s3 = scanner.next();
//
//
//        System.out.println(s1 + " " + s2 + " " + s3);

    int i =0;
    while(i<5){
        System.out.print("Enter a string: ");
        String input = scanner.next();
        System.out.println("You entered: " + input + " ");
        System.out.println("Your entered string number is: " + (i+1));
        i++;

    }
    }
}
