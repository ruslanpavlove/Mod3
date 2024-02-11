package ShapesWithoutInterface;

public abstract class Quadrilateral {
    protected double sideA, sideB, sideC, sideD;

    public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC + sideD;
    }

    public abstract double calculateArea();

    public String getType() {
        return "Четырехугольник";
    }
}