import java.util.*;

public class HW5 {
    static Scanner sc = new Scanner(System.in);

    // 1.10
    static void task110(int[] array) {
        String pal = "", temp, s;

        for (int i : array) {
            s = Integer.toString(i);
            temp = new StringBuilder(s).reverse().toString();

            if (s.equals(temp)) {
                if (pal != "") {
                    System.out.println(s);
                    return;
                } else pal = s;
            }
        }

        System.out.println(pal);
    }


    // 1.20
    static void task120() {
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();
        System.out.print(array[0] + " ");
        int ind = 0;

        for (int i = 1; i < n; i++) {
            if (ind == 1) {
                if (array[i] > array[i - 1]) System.out.print(array[i] + " ");
                else {
                    ind = 0;
                    System.out.print("\n" + array[i] + " ");
                }
            } else if (ind == -1) {
                if (array[i] < array[i - 1]) System.out.print(array[i] + " ");
                else {
                    ind = 0;
                    System.out.print("\n" + array[i] + " ");
                }
            } else {
                if (array[i] > array[i - 1]) {
                    ind = 1;
                    System.out.print(array[i] + " ");
                } else if (array[i] < array[i - 1]) {
                    ind = -1;
                    System.out.print(array[i] + " ");
                } else System.out.print("\n" + array[i] + " ");
            }
        }
    }

    static void printArray(int array[]) {
        for (int i : array) System.out.print(i + " ");
        System.out.println();
    }

    static boolean isEmpty(int[] array) {
        for (int i : array) if (i != 0) return false;
        return true;
    }


    public static void main(String[] args) {
        int[] array1 = {123, 333, 14514};
        int[] array2 = {123, 333, 14514, 1991, 1};
        task110(array1);
        task110(array2);
        task120();
    }
}