//This is a third code
// Class to hold Math Constants
class MathConstants {
    // Final variable PI
    final double PI = 3.14159;

    // Final method to display PI
    final void displayPI() {
        System.out.println("The value of PI is: " + PI);
    }
}

// Class Circle inheriting from MathConstants
class Circle extends MathConstants {

    // Method to calculate and print the area of a circle
    void calculateArea(double radius) {
        // PI is accessible here as it's inherited
        double area = PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }

    // Trying to override displayPI() will result in a compile-time error.
    // Uncommenting the following will show the error:
    /*
    @Override
    void displayPI() {
        System.out.println("Overriding PI display"); // This will cause a compile-time error
    }
    */

    //Trying to modify PI directly will also result in a compile-time error
    // Uncommenting the following line will show the error:
    /*
    void modifyPI() {
        PI = 3.14; // This will cause a compile-time error
    }
    */
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle();

        // Calculate and print the area of a circle with radius 5
        myCircle.calculateArea(5);

        // Access and print PI directly
        System.out.println("PI from Circle instance: " + myCircle.PI);

        // Call the final method to display PI
        myCircle.displayPI();

        MathConstants mc = new MathConstants();
        mc.displayPI();


    }
}
