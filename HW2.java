import java.util.*;
import java.lang.Math;


public class HW2 {
    static Scanner sc = new Scanner(System.in);

    /** 
     * @param a
     * @param b
     * @return double
     */
    // 3.20
    static double task320(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
    /** 
     * @return double
     */
    // 4.2 (a)
    static double task42a() {
        System.out.print("Enter variable x: ");
        double x = sc.nextDouble();
        System.out.print("Enter variable y: ");
        double y = sc.nextDouble();

        return Math.pow(x, 3) + 3*Math.pow(x, 2)*y + 3*x*Math.pow(y, 2) + Math.pow(y, 3);
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Enter cathetus a: ");
        double a = sc.nextDouble();
        System.out.print("Enter cathetus b: ");
        double b = sc.nextDouble();

        System.out.println("c = " + task320(a, b));
        System.out.println("f(x, y) = " + task42a());

        sc.close();
    }
}