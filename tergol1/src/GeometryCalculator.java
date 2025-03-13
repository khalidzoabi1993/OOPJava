import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        // Q2 Sol
        Scanner scanner = new Scanner(System.in);

        // Define constant for PI
        final double PI = Math.PI;

        // Get user input for circle radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Compute circle circumference and area
        double circleCircumference = 2 * PI * radius;
        double circleArea = PI * radius * radius;

        // Get user input for square side length
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        // Compute square perimeter and area
        double squarePerimeter = sideLength * 4;
        double squareArea = sideLength * sideLength;

        // Print results
        System.out.println("\nResults:");
        System.out.println("Circle Circumference: " + circleCircumference);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Square Perimeter: " + squarePerimeter);
        System.out.println("Square Area: " + squareArea);

        // Close scanner
        scanner.close();
    }
}
