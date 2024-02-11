package Shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side, side, side);
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }
}