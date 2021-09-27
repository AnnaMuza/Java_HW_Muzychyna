import java.lang.Math;
import java.util.*;


public class Aud2 {
    static Scanner sc = new Scanner(System.in);

    // 3.1
    static void task31() {
        System.out.println("1.2 + 31 = " + (1.2 + 31));
        System.out.println("45*54 - 11 = " + (45*54 - 11));
        System.out.println("15/4 = " + 15/4);
        System.out.println("15.0/4 = " + 15.0/4);
        System.out.println("67 % 5 = " + (67 % 5));
        System.out.println("(2*45.1 + 3.2)/2 = " + ((2*45.1 + 3.2)/2));
    }

    // 3.2
    static void task32() {
        System.out.println("Results:");
        System.out.println("2 + 3 = " + (2 + 3));
        System.out.println("4.56*56 = " + (4.5*56));
        System.out.println("2/3.0 = " + (2/3.0));
    }

    // 3.3
    static void task33() {
        System.out.print("Enter name: ");
        String s = sc.nextLine();
        System.out.println("Hello, " + s);
    }

    // 3.4
    static void task34() {
        float a1 = 0.0001f;
        double a2 = Math.pow(10, -4);
        float b1 = 2.33e5f;
        double b2 = 2.33e5;
        float pi1 = (float) Math.PI;
        double pi2 = Math.PI;
        float e1 = (float) Math.E;
        double e2 = Math.E;
        float c1 = (float) Math.sqrt(5);
        double c2 = Math.sqrt(5);
        float d1 = (float) Math.log(100);
        double d2 = Math.log(100);
        System.out.printf("%f, %f, %f, %f, %f, %f, %f, %f, %f, %f, %f, %f\n",
                           a1, a2, b1, b2, pi1, pi2, e1, e2, c1, c2, d1, d2);
    }

    // 3.7
    static void task37() {
        System.out.print("Enter m1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter m2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter r: ");
        double r = sc.nextDouble();
        double gamma = 6.673*Math.pow(10, -11);
        double F = gamma*m1*m2/Math.pow(r, 2);
        System.out.printf("F = %e\n", F);
    }

    // 3.13
    static void task313() {
        System.out.print("Enter num: ");
        double num = sc.nextDouble();
        System.out.printf("%20.4f\n", Math.pow(num, 8));
    }

    // 4.3
    static double Rosenbrock2d(double x, double y) {
        return 100*Math.pow((Math.pow(x, 2) - y), 2) + Math.pow((x - 1), 2);
    }


    public static void main(String[] args) {
        task31();
        task32();
        task33();
        task34();
        task37();
        task313();
        System.out.println(Rosenbrock2d(4.234, 56.2234));
        sc.close();
    }
}