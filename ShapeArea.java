public class ShapeArea {
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
        System.out.println("The area of Rectangle (5.0 x 4.0): " + area(5.0, 4.0));
        System.out.println("The area of Square (4.0): " + area(4.0));
        System.out.println("The area of Circle (radius 3.0): " + area(3.0f));
        System.out.println("The area of Triangle (base 6.0, height 4.0): " + area(6.0, 4.0, true));
    }
}
