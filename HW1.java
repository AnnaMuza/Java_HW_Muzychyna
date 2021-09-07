import java.util.Scanner;


class HW1 {

    // 2.2
    static void task22(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Place value of the first number: " + Integer.toString(a).length() + " (string method)");
        System.out.println("Place value of the second number: " + Integer.toString(b).length() + " (string method)");

        System.out.println("Place value of the first number: " + (int) (Math.log10(a) + 1) + " (logarithm method)");
        System.out.println("Place value of the second number: " + (int) (Math.log10(b) + 1) + " (logarithm method)");

        System.out.println(String.format("Harmonic mean = %.2f\n", 2/(1/(double) a + 1/(double) b)));
    }

    // 2.3
    static void task23(Scanner sc) {
        System.out.print("Enter two numbers (separated by a space): ");
        String[] s = sc.nextLine().split(" ");

        double q = Double.parseDouble(s[0]);
        double w = Double.parseDouble(s[1]);
        double g = Math.sqrt(q*w);

        System.out.println(String.format("Geometric mean = %e = %f\n", g, g));
    }

    // 2.4
    static void task24(Scanner sc) {
        System.out.print("Enter degrees Celsius: ");
        double c = sc.nextDouble();
        double f = 9*c/5 + 32;
        System.out.println(String.format("Degrees Fahrenheit = %.3f", f));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        task23(sc);
        task22(sc);
        task24(sc);

        sc.close();
    }
}