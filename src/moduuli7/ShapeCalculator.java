package moduuli7;

class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }


    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0, "Red");
        shapes[1] = new Rectangle(4.0, 6.0, "Green");
        shapes[2] = new Triangle(3.0, 8.0, "Blue");

        System.out.println("Shape Calculator\n");

        for (Shape shape : shapes) {
            String shapeName = shape.getClass().getSimpleName();
            double area = shape.calculateArea();
            String color = shape.getColor();
            System.out.println("Area of " + color + " " + shapeName + ": " + area);
        }
    }
}
