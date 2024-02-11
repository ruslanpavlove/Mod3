package Shapes;

public class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid(double sideA, double sideB, double sideC, double sideD, double height) {
        super(sideA, sideB, sideC, sideD);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double averageLength = (sideA + sideB) / 2;
        return averageLength * height;
    }
}