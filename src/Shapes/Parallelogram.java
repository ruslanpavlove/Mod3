package Shapes;

public class Parallelogram extends Quadrilateral {
    private double height;

    public Parallelogram(double sideA, double sideB, double height) {
        super(sideA, sideB, sideA, sideB);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return sideA * height;
    }
}