package ShapesWithoutInterface;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle2 = new Circle(5);
        Square square = new Square(4);

        double areaCircle = circle.calculateArea();
        double areaCircle2 = circle2.calculateArea();
        double areaSquare = square.calculateArea();

        double perimeterCircle = circle.calculatePerimeter();
        double perimeterCircle2 = circle2.calculatePerimeter();
        double perimeterSquare = square.calculatePerimeter();

        double maxArea = Calculate.findMaxArea(areaCircle, areaCircle2, areaSquare);
        double minArea = Calculate.findMinArea(areaCircle, areaCircle2, areaSquare);
        double maxPerimeter = Calculate.findMaxPerimeter(perimeterCircle, perimeterCircle2, perimeterSquare);
        double minPerimeter = Calculate.findMinPerimeter(perimeterCircle, perimeterCircle2, perimeterSquare);

        System.out.println("Максимальная площадь среди всех фигур: " + maxArea);
        System.out.println("Минимальная площадь среди всех фигур: " + minArea);
        System.out.println("Максимальный периметр среди всех фигур: " + maxPerimeter);
        System.out.println("Минимальный периметр среди всех фигур: " + minPerimeter);
    }
}