package Shapes;

public class Rectangle extends Quadrilateral {
    public Rectangle(double length, double width) {
        super(length, width, length, width);
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }
}