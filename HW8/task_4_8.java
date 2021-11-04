import java.lang.Math;


// 4.8
class ComplexPoint {
    double a, b;

    ComplexPoint(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("Point(%f, %f*i)", a, b);
    }

    double distance_to_point(ComplexPoint p) {
        return Math.sqrt(Math.pow((p.a - this.a), 2) + Math.pow((p.b - this.b), 2));
    }

    double distance_to_origin() {
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
    }
}


public class task_4_8 {
    public static void main(String[] args) {
        ComplexPoint p1 = new ComplexPoint(1, 2.1);
        ComplexPoint p2 = new ComplexPoint(-5, 6);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.distance_to_point(p2));
        System.out.println(p1.distance_to_origin());
        System.out.println(p2.distance_to_origin());
    }
}