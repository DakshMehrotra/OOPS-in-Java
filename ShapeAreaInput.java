import java.util.Scanner;

public class ShapeAreaInput {
    public static double area(double length, double width) {
        return length * width;
    }
    public static double area(double side) {
        return side * side;
    }
    public static double area(float radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Rectangle
                System.out.print("Enter the length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width: ");
                double width = scanner.nextDouble();
                System.out.println("Area of Rectangle: " + area(length, width));
                break;

            case 2: // Square
                System.out.print("Enter the side length: ");
                double side = scanner.nextDouble();
                System.out.println("Area of Square: " + area(side));
                break;

            case 3: // Circle
                System.out.print("Enter the radius: ");
                float radius = scanner.nextFloat();
                System.out.println("Area of Circle: " + area(radius));
                break;

            case 4: // Triangle
                System.out.print("Enter the base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height: ");
                double height = scanner.nextDouble();
                System.out.println("Area of Triangle: " + area(base, height, true));
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }

        scanner.close();
    }
}
