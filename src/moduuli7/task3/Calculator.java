package moduuli7.task3;

public class Calculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(8.0);
        shapes[1] = new Rectangle(7.0, 2.0);
        shapes[2] = new Triangle(5.0, 5.0);

        System.out.println("Shape Calculator\n");

        for (Shape shape : shapes) {
            String shapeName = shape.getClass().getSimpleName();
            double area = shape.calculateArea();
            System.out.println("Area of " + shapeName + ": " + area);
        }
    }
}
