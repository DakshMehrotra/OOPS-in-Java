abstract class Shape {
    abstract void calculateArea();
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        System.out.println("The area of rectangle is: " + (length * width));
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("The area of circle is: " + (Math.PI * radius * radius));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Circle circ = new Circle(7);
        
        rect.calculateArea();
        circ.calculateArea();
    }
}
