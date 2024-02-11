package ShapesWithoutInterface;

public abstract class Triangle {
    protected double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public abstract double calculateArea();

    public String getType() {
        return "Треугольник";
    }
}