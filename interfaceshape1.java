import java.util.*;
interface Shape {
    double area();
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class interfaceshape1 {
    public static void main(String[] args) {
        Square s = new Square(5);
        Circle c = new Circle(3);

        System.out.println("Area of Square: " + s.area());
        System.out.println("Area of Circle: " + c.area());
    }
}