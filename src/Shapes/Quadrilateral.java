package Shapes;

public abstract class Quadrilateral implements Shape {
    protected double sideA, sideB, sideC, sideD;

    public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC + sideD;
    }

    @Override
    public String getType() {
        return "Четырехугольник";
    }
}