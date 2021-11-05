import java.lang.Math;
import java.util.*;


// 3.9
class Point {
    double a, b;

    Point(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("Point(%f, %f)", a, b);
    }

    double distance_to_point(Point p) {
        return Math.sqrt(Math.pow((p.a - this.a), 2) + Math.pow((p.b - this.b), 2));
    }

    double distance_to_origin() {
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
    }
}


class Circle {
    Point center;
    double radius;

    Circle(double a, double b, double r) {
        center = new Point(a, b);
        radius = r;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle((%f, %f), r=%f)", center.a, center.b, radius);
    }
}


class Line {
    private double x_coeff;
    private double y_coeff;
    private double free_coeff;
    private double eps = Math.pow(10, -4);

    Line(Point point1, Point point2) {
        x_coeff = -1 * (point2.b - point1.b);
        y_coeff = (point2.a - point1.a);
        free_coeff = x_coeff * -point1.a + y_coeff * -point1.b;

        if ((double)(int)x_coeff == x_coeff && (double)(int)y_coeff == y_coeff && (double)(int)free_coeff == free_coeff) {
            int gcd1, gcd2, gcd3;
            gcd1 = gcd(Math.abs((int)x_coeff), Math.abs((int)y_coeff));
            gcd2 = gcd(Math.abs((int)x_coeff), Math.abs((int)free_coeff));
            gcd3 = gcd(Math.abs((int)free_coeff), Math.abs((int)y_coeff));

            if (gcd1 == gcd2 && gcd2 == gcd3) {
                x_coeff = x_coeff / gcd1;
                y_coeff = y_coeff / gcd1;
                free_coeff = free_coeff / gcd1;
            }
        }
    }

    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    boolean isPointInside(Point point) {
        return Math.abs(x_coeff * point.a + y_coeff * point.b + free_coeff) < eps;
    }

    @Override
    public boolean equals(Object o) {
        Line that = (Line) o;
        return Double.compare(that.x_coeff, x_coeff) == 0 && Double.compare(that.y_coeff, y_coeff) == 0 && Double.compare(that.free_coeff, free_coeff) == 0;
    }
}


public class task_3_9 {
    public static void main(String[] args) {
        Circle cr1 = new Circle(1, 2, 3.5);
        Circle cr2 = new Circle(2, 3, 20);
        Circle cr3 = new Circle(3, 4, 0.1);
        Circle cr4 = new Circle(0, 0, 4);
        Circle[] circles = {cr1, cr2, cr3, cr4};
        
        ArrayList<Line> lines = new ArrayList<>();
        for (int i = 0; i < circles.length; i++) {
            for (int j = i + 1; j < circles.length; j++) {
                Line line = new Line(circles[i].center, circles[j].center);
                if (!lines.contains(line)) lines.add(line);
            }
        }

        int circles_in_line;
        String out_str;
        for (Line line : lines) {
            circles_in_line = 0;
            out_str = "";
            for (Circle circle : circles) {
                if (line.isPointInside(circle.center)) {
                    circles_in_line++;
                    out_str += circle + "\n";
                }
            }
            if (circles_in_line > 2) {
                System.out.println("Circles on the same line:");
                System.out.println(out_str);
            }
        }

        double tempa, tempp, area_min = Double.MAX_VALUE, perimeter_min = Double.MAX_VALUE, area_max = Double.MIN_VALUE, perimeter_max = Double.MIN_VALUE;
        Circle min_area = cr1, min_perim = cr1, max_area = cr1, max_perim = cr1;
        for (Circle i : circles) {
            tempa = i.getArea();
            tempp = i.getPerimeter();

            if (tempa < area_min) {
                area_min = tempa;
                min_area = i;
            }

            if (tempp < perimeter_min) {
                perimeter_min = tempp;
                min_perim = i;
            }

            if (tempa > area_max) {
                area_max = tempa;
                max_area = i;
            }

            if (tempp > perimeter_max) {
                perimeter_max = tempp;
                max_perim = i;
            }
        }

        System.out.println("Circle of min area:");
        System.out.printf("%s with area = %f\n\n", min_area, area_min);

        System.out.println("Circle of max area:");
        System.out.printf("%s with area = %f\n\n", max_area, area_max);

        System.out.println("Circle of min perimeter:");
        System.out.printf("%s with perimeter = %f\n\n", min_perim, perimeter_min);

        System.out.println("Circle of max perimeter:");
        System.out.printf("%s with perimeter = %f\n", max_perim, perimeter_max);
    }
}