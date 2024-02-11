package Shapes;

public class RightTriangle extends Triangle {
    public RightTriangle(double base, double height) {
        super(base, height, Math.sqrt(base * base + height * height));
    }

    @Override
    public double calculateArea() {
        return (sideA * sideB) / 2;
    }
}