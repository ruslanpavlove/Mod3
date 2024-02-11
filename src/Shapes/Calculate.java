package Shapes;

public class Calculate {

    public static double findMaxArea(Shape[] shapes) {
        double maxArea = 0;
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static double findMinArea(Shape[] shapes) {
        if (shapes.length == 0) {
            return 0;
        }
        double minArea = shapes[0].calculateArea();
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            if (area < minArea) {
                minArea = area;
            }
        }
        return minArea;
    }

    public static double findMaxPerimeter(Shape[] shapes) {
        double maxPerimeter = 0;
        for (Shape shape : shapes) {
            double perimeter = shape.calculatePerimeter();
            if (perimeter > maxPerimeter) {
                maxPerimeter = perimeter;
            }
        }
        return maxPerimeter;
    }

    public static double findMinPerimeter(Shape[] shapes) {
        if (shapes.length == 0) {
            return 0;
        }
        double minPerimeter = shapes[0].calculatePerimeter();
        for (Shape shape : shapes) {
            double perimeter = shape.calculatePerimeter();
            if (perimeter < minPerimeter) {
                minPerimeter = perimeter;
            }
        }
        return minPerimeter;
    }
}