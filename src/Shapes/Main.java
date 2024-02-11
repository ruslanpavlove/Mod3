package Shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(5),
                new Circle(3),
                new Square(4),
                new Rectangle(5, 3),
                new Parallelogram(4, 6, 5),
                new Trapezoid(3, 5, 4, 4, 3),
                new RightTriangle(3, 4),
                new EquilateralTriangle(6),
        };

        double maxArea = Calculate.findMaxArea(shapes);
        double minArea = Calculate.findMinArea(shapes);
        double maxPerimeter = Calculate.findMaxPerimeter(shapes);
        double minPerimeter = Calculate.findMinPerimeter(shapes);

        System.out.println("Максимальная площадь среди всех фигур: " + maxArea);
        System.out.println("Минимальная площадь среди всех фигур: " + minArea);
        System.out.println("Максимальный периметр среди всех фигур: " + maxPerimeter);
        System.out.println("Минимальный периметр среди всех фигур: " + minPerimeter);
    }
}