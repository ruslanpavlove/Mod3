package ShapesWithoutInterface;

public class Calculate {

    public static double findMaxArea(double... areas) {
        double maxArea = 0;
        for (double area : areas) {
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static double findMinArea(double... areas) {
        double minArea = Double.MAX_VALUE;
        for (double area : areas) {
            minArea = Math.min(minArea, area);
        }
        return minArea;
    }

    public static double findMaxPerimeter(double... perimeters) {
        double maxPerimeter = 0;
        for (double perimeter : perimeters) {
            maxPerimeter = Math.max(maxPerimeter, perimeter);
        }
        return maxPerimeter;
    }

    public static double findMinPerimeter(double... perimeters) {
        double minPerimeter = Double.MAX_VALUE;
        for (double perimeter : perimeters) {
            minPerimeter = Math.min(minPerimeter, perimeter);
        }
        return minPerimeter;
    }
}
