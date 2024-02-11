package Shapes;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * sideA * sideA;
    }
}