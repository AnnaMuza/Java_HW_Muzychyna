import java.util.*;


public class HW4 {
    // static Scanner sc = new Scanner(System.in);
 
    // 4.1
    static String DecimalExpansion(int p, int q) {
        // System.out.print("Enter p: ");
        // int p = sc.nextInt();
        // System.out.print("Enter q: ");
        // int q = sc.nextInt();
        
        String quotient = String.join("", Integer.toString(p/q), ".");
        int c = 10 * (p % q);

        while (c != 0 && c < q) {
            c *= 10;
            quotient = String.join("", quotient, "0");
        }

        String digits = "";
        Map<Integer, Integer> passed = new HashMap<Integer, Integer>();
        int i = 0;

        while (true) {
            if (passed.keySet().contains(c)) {
                String prefix = digits.substring(0, passed.get(c));
                String cycle = digits.substring(passed.get(c));
                String result = String.join("", quotient, prefix, "(", cycle, ")");
                result = result.replaceAll("\\(0\\)", "");
                result = result.replaceAll("\\.$", "");
                return result;
            }
            int q1 = c/q;
            int r = c % q;
            passed.put(c, i);
            digits = String.join("", digits, Integer.toString(q1));
            i++;
            c = 10*r;
        }
    }

    // 4.20.й)
    static double task420(double x, double eps) {
        double sum = 1;
        double temp = 1;

        while (Math.abs(temp) >= eps) {
            temp *= -Math.pow(x, 2);
            sum += temp;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(DecimalExpansion(1, 33));
        System.out.println(DecimalExpansion(8639, 70000));
        System.out.println(DecimalExpansion(1, 7));
        System.out.println(DecimalExpansion(1, 5));
        System.out.println(DecimalExpansion(5, 5) + "\n");

        System.out.println(task420(0.7, 0.00001));

        // sc.close();
    }
}
