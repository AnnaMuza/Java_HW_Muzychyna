public class HW3 {

    // 2.17
    static void task217(int n) {
        System.out.println("n = " + n);
        String s = Integer.toBinaryString(n);
        s = new StringBuilder(s).reverse().toString();
        System.out.println(s);
        System.out.println(Integer.parseInt(s, 2) + "\n");
    }

    public static void main(String[] args) {
        task217(7);
        task217(345);
        task217(11);
    }
}