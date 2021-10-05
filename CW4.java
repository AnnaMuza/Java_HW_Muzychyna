import java.util.*;
import java.lang.Math;


public class CW4 {
    static Random random = new Random();

    // 3.2
    static void task32() {
        int a = random.nextInt(100);

        for (int i = 0; i < 25; i++) {
            int b = random.nextInt(100);
            
            if (a > b) {
                System.out.println(a + " > " + b);
            } else if (a < b) {
                System.out.println(a + " < " + b);
            } else {
                System.out.println(a + " == " + b);
            }

            a = b;
        }
    }

    // 3.3
    static int RollDie() {
        return random.nextInt(6) + 1;
    }

    // 3.4
    static void task34(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && b == c) {
            System.out.println(1);
        }
        else if (a == b || a == c || b == c) {
            System.out.println(2);
        }
        else {
            System.out.println(3);
        }
    }

    // 3.6
    static void task36() {
        int n = 10000000;
        double s = 0;

        for (int i = 0; i < n; i++)
            if (Alice() <  Bob())
                s++;

        System.out.println("Answer: " + s/n);
        System.out.println("Correct answer: " + 39./121);
    }

    static int Alice() {
        int count = 2;
        int prev = random.nextInt(2);
        int temp = random.nextInt(2);

        while (prev + temp < 2) {
            prev = temp;
            temp = random.nextInt(2);
            count++;
        }
        return count;
    }

    static int Bob() {
        int count = 2;
        int prev = random.nextInt(2);
        int temp = random.nextInt(2);

        while (temp >= prev) {
            prev = temp;
            temp = random.nextInt(2);
            count++;
        }
        return count;
    }

    // 4.20.a)
    static double task420a(double x, double eps) {
        double sum = x;
        double i = 1;
        double temp = x;

        while (Math.abs(temp) >= eps) {
            temp *= -Math.pow(x, 2);
            i += 2;
            temp /= i*(i - 1);
            sum += temp;
        }
        return sum;
    }

    
    public static void main(String[] args) {
        task32();
        System.out.println(RollDie());
        // task34(args);
        task36();
        System.out.println(task420a(5, 0.0001));
    }
}
