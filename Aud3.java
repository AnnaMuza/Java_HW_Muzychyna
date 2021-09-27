import java.util.*;


public class Aud3 {
    static Scanner sc = new Scanner(System.in);
 
    // 2.1
    static void task21() {
        int a = 6;
        int b = 34;

        int x = a | b;
        int y = a ^ b;
        int z = a & b;
        
        System.out.println(a + " " + Integer.toBinaryString(a));
        System.out.println(b + " " + Integer.toBinaryString(b));
        System.out.println("a or b " + Integer.toBinaryString(x));
        System.out.println("a xor b " + Integer.toBinaryString(y));
        System.out.println("a and b " + Integer.toBinaryString(z));
    }

    // 2.2
    static void task22() {
        int a = 34;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("a >> 1 = " + Integer.toBinaryString(a >> 1));
        System.out.println("a >> 2 = " + Integer.toBinaryString(a >> 2));
        System.out.println("a >> 3 = " + Integer.toBinaryString(a >> 3));
        System.out.println("a >> 4 = " + Integer.toBinaryString(a >> 4));
        System.out.println("a >> 5 = " + Integer.toBinaryString(a >> 5));
    }

    static String char_to_bin(char a) {
        return Integer.toBinaryString(a);
    }

    // 2.3
    static void task23() {
        char a = 'a';
        char b = 'b';
        char c = 'c';

        System.out.println(char_to_bin(a));
        System.out.println(char_to_bin(b));
        System.out.println(char_to_bin(c));
    }

    // 2.4
    static void task24() {
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(7));
    }

    // 2.4
    static void task25() {
        System.out.print("Enter n: ");
        int a = sc.nextInt();
        String a1 = Integer.toBinaryString((a << 7) | (a >> (Integer.SIZE - 7)));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a1);
    }


    public static void main(String[] args) {
        // task21();
        // task22();
        // task23();
        // task24();
        task25();
        sc.close();
    }
}
