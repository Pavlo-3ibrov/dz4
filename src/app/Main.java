package app;

interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Main {

    public static void printTotalArea(Shape[] shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        System.out.println("Сумарна площа всіх фігур у масиві: " + totalArea);
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0),
                new Square(4.0),
                new Triangle(6.0, 3.0)
        };

        printTotalArea(shapes);


    }
}