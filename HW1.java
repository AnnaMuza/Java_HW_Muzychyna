import java.util.Scanner;

/**
 * HW 1, 06.09.21, tasks 2.2, 2.3 (main), 2.4
 * @author Anna Muzychina
 */


public class HW1 {
    static Scanner sc = new Scanner(System.in);

    // 2.2
    static void task22() {
        System.out.print("2.2\nEnter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.printf("Place value of the first number: %d (string method)\n", Integer.toString(a).length());
        System.out.printf("Place value of the second number: %d (string method)\n", Integer.toString(b).length());

        System.out.printf("Place value of the first number: %d (logarithm method)\n", (int) (Math.log10(a) + 1));
        System.out.printf("Place value of the second number: %d (logarithm method)\n", (int) (Math.log10(b) + 1));

        System.out.printf("Harmonic mean = %.2f\n\n", 2/(1/(double) a + 1/(double) b));
    }

    // 2.3 (main task)
    static void task23() {
        System.out.print("2.3\nEnter two numbers (separated by a space): ");

        double q = Double.parseDouble(sc.next());
        double w = Double.parseDouble(sc.next());
        double g = Math.sqrt(q*w);

        System.out.printf("Geometric mean = %e = %f\n\n", g, g);
    }

    // 2.4
    static void task24() {
        System.out.print("2.4\nEnter degrees Celsius: ");
        double c = sc.nextDouble();
        double f = 9*c/5 + 32;
        System.out.printf("Degrees Fahrenheit = %.3f\n", f);
    }


    public static void main(String[] args) {
        System.out.println("Anna Muzychina, 06.09.21, tasks 2.2, 2.3 (main), 2.4");

        task23();
        task22();
        task24();

        sc.close();
    }
}