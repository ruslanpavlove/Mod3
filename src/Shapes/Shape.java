package Shapes;

public interface Shape {
    double calculateArea();

    default double calculatePerimeter() {
        return 0;
    }

    String getType();
}