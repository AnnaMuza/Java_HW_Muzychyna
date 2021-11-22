package HW11;

import java.math.BigInteger;


public class Task_7 {
    public static void convertFromDecimal(int n, int b) {
        BigInteger number = new BigInteger(String.valueOf(n), 10);
        System.out.println(number.toString(b).toUpperCase());
    }

    public static void main(String[] args) {
        int n = 20, i = 0;

        int b = 16;
        System.out.printf("n = %d, b = %d\n", n, b);
        for (i = 0; i <= n; i++) convertFromDecimal(i, b);

        b = 7;
        System.out.printf("\nn = %d, b = %d\n", n, b);
        for (i = 0; i <= n; i++) convertFromDecimal(i, b);

        b = 2;
        System.out.printf("\nn = %d, b = %d\n", n, b);
        for (i = 0; i <= n; i++) convertFromDecimal(i, b);
    }
}