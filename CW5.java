import java.util.*;


public class CW5 {
    static Scanner sc = new Scanner(System.in);

    // 1.1
    static void task11() {
        String[] s = {"a", "b", "c"};
        for (String el : s)
            System.out.print(el + " ");
        System.out.println();
    }


    // 1.2
    static void MaxMin() {
        String s = sc.nextLine();
        String[] array = s.split(" ");
        int max = -2147483647;
        int min = 2147483647;

        for (String el : array) {
            int n = Integer.parseInt(el);
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Max = " +  max);
        System.out.println("Min = " + min);
    }


    // 1.3
    static void task13() {
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextDouble();

        System.out.println("Mean = " + mean(array));
        System.out.println("Standard deviation = " + SD(array));
    }

    static double mean(double[] array) {
        double sum = 0.;
        for (double n : array) sum += n;

        return sum/array.length;
    }

    static double SD(double[] array) {
        double mean = mean(array);
        double sd = 0.;
        for (double n : array) sd += Math.pow(n - mean, 2);

        return Math.sqrt(sd/array.length);
    }
    

    // 1.4
    static void task14() {
        System.out.print("Enter string of integers: ");
        String s = sc.nextLine();
        String[] array_s = s.split(" ");
        int[] array = new int[array_s.length];
        for (int i = 0; i < array.length; i++) array[i] = Integer.parseInt(array_s[i]);

        int number = 0;
        int len = 1;
        int max_len = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                if (max_len < len) {
                    max_len = len;
                    number = array[i - 1];
                }
                len = 1;
            } else len++;
        }

        System.out.println(max_len + " integers = " + number + " in a row");
    }


    // 1.5
    static void task15() {
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter y: ");
        double y = sc.nextDouble();
        System.out.print("Enter z: ");
        double z = sc.nextDouble();

        System.out.print("\nEnter the number of points: ");
        int n = sc.nextInt();
        System.out.println();

        double[] xi = new double[n];
        double[] yi = new double[n];
        double[] zi = new double[n];
        double max_distance = 0;
        int max_ind = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter x_%d: ", (i + 1));
            xi[i] = sc.nextDouble();
            System.out.printf("Enter y_%d: ", (i + 1));
            yi[i] = sc.nextDouble();
            System.out.printf("Enter z_%d: ", (i + 1));
            zi[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            double distance = calc_distance(x, y, z, xi[i], yi[i], zi[i]);

            if (distance > max_distance) {
                max_distance = distance;
                max_ind = i;
            }
        }

        System.out.printf("\nClosest point: (%f, %f, %f)\n", xi[max_ind], yi[max_ind], zi[max_ind]);
    }

    static double calc_distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt((y2 - y1)*(y2 - y1) + (x2 - x1)*(x2 - x1) + (z2 - z1)*(z2 - z1));
    }


    // 1.6
    static void task16(int[] array) {
        int n = array.length;
        int min_len = 2147483647;
        String[] arrs = new String[n];

        for (int i = 0; i < n; i++) {
            arrs[i] = Integer.toString(array[i]);
            if (arrs[i].length() < min_len) min_len = arrs[i].length();
        }

        for (String s : arrs) if (s.length() == min_len) System.out.println(s);
    }


    public static void main(String[] args) {
        task11();
        MaxMin();
        task13();
        task14();
        task15();
        int[] array = {1, 2, 333, 4444, 55555};
        task16(array);

        sc.close();
    }
}