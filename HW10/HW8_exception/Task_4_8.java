package HW10.HW8_exception;
import java.lang.Math;


class ComplexPointException extends ArithmeticException {
    private String detail;

    ComplexPointException(String message) {
        detail = message;
    }

    @Override
    public String toString() {
        return detail;
    }
}


// 4.8
class ComplexPoint {
    private double a, b;

    ComplexPoint(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("Point(%.2f, %.2f*i)\n", a, b);
    }

    public double distance_to_point(ComplexPoint p) throws ComplexPointException {
        if ((this.a == p.a) && (this.b == p.b)) throw new ComplexPointException("Distance between identical points!");

        return Math.sqrt(Math.pow((p.a - this.a), 2) + Math.pow((p.b - this.b), 2));
    }

    public double distance_to_origin() throws ComplexPointException {
        if ((this.a == 0) && (this.b == 0)) throw new ComplexPointException("Point is origin!");

        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
    }
}


public class Task_4_8 {
    public static void main(String[] args) {
        ComplexPoint p1 = new ComplexPoint(1, 2.1);
        ComplexPoint p2 = p1;
        ComplexPoint p3 = new ComplexPoint(0, 0);

        System.out.println("" + p1 + p2 + p3);

        try {
            System.out.println(p1.distance_to_point(p2));
        } catch (ComplexPointException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(p1.distance_to_point(p3));
        } catch (ComplexPointException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(p3.distance_to_origin());
        } catch (ComplexPointException e) {
            e.printStackTrace();
        }
    }
}