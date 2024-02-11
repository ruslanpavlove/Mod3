package ShapesWithoutInterface;

public class Parallelogram extends Quadrilateral {
    private double height;

    public Parallelogram(double base, double side, double height) {
        super(base, side, base, side);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return sideA * height;
    }
}