import java.util.Scanner;


class Class1 {
    int a;
    char c;
    String s;
}


class Class2 {
    static int number = 9;
}


public class Aud1 {

    // 1.1
    static void task11() {
        Class1 cl = new Class1();
        System.out.println(cl.a);
        System.out.println(cl.c);
        System.out.println(cl.s);
    }

    // 1.2, 1.3
    static void task123() {
        System.out.println("Hello, World");
    }

    // 1.4
    static void task14() {
        Class2 nw1 = new Class2();
        Class2 nw2 = new Class2();
        Class2 nw3 = new Class2();
        System.out.println(nw1.number);
        nw2.number = 3;
        System.out.println(nw3.number);
        System.out.println(Class2.number);
        System.out.println(nw1.number == nw2.number);
        System.out.println(nw2.number == nw3.number);
    }

    // 1.5
    static void task15(String[] args) {
        System.out.println(args[0] + ", " + args[1] + ", " + args[2]);
    }

    // 1.6
    static void task16(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Double.valueOf(args[i]);
        }
        System.out.println("sum=" + sum);
    }
    
    // 2.1
    static void task21() {
        System.out.println("Enter surname:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Hello, " + s);
        sc.close();
    }


    public static void main(String[] args) {
        task11();
        task123();
        task14();
        task15(args);
        task16(args);
        task21();
    }
}