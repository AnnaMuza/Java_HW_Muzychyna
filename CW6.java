import java.util.*;


class Class31 {
    String s;
}

class Class32 {
    String s = "qwerty";
    String s2;

    public Class32() {
        s2 = "qwerty";
    }
    
    void print() {
        System.out.println(s);
        System.out.println(s2);
    }
}

class Class33 {
    public Class33() {
        System.out.println("hello world");
    }
}

class Class34 {
    public Class34() {
        System.out.println("hello world");
    }

    public Class34(String name) {
        this();
        System.out.println(name);
    }
}


public class CW6 {

    static void printMatrix(int matr[][]) {
        for (int[] i : matr) {
            for (int j : i) System.out.print(j + " ");
            System.out.println();
        } System.out.println();
    }

    // 2.1
    static int[][] task21(int matr[][], int k) {
        int n = matr.length;
        int[][] res = matr.clone();
        k--;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (res[j][k] > res[j + 1][k]) {
                    int[] temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                }
        return res;
    }

    // 2.2
    static int[][] task22(int matr[][], int k, String direction) {
        int n = matr.length;
        k = k % n;
        int[][] new_matr = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (Objects.equals(direction, "up")) new_matr[i][j] = matr[(i + k) % n][j];
                if (Objects.equals(direction, "down")) new_matr[i][j] = matr[(i + n - k) % n][j];
                if (Objects.equals(direction, "right")) new_matr[i][j] = matr[i][(j + k) % n];
                if (Objects.equals(direction, "left")) new_matr[i][j] = matr[i][(j + n - k) % n];
            }

        return new_matr;
    }

    // 3.1
    static void task31() {
        Class31 s = new Class31();
        System.out.println(s.s);
    }

    // 3.2
    static void task32() {
        Class32 c = new Class32();
        c.print();
    }

    // 3.3
    static void task33() {
        Class33 q = new Class33();
    }

    // 3.4
    static void task34() {
        Class34 t = new Class34("hello");
    }


    public static void main(String[] args) {
        int matrix[][] = { { 39, 27, 11, 42 },
                           { 10, 93, 91, 90 },
                           { 54, 78, 56, 89 },
                           { 24, 64, 20, 65 } };

        printMatrix(task21(matrix, 3));
        printMatrix(task22(matrix, 1, "up"));
        printMatrix(task22(matrix, 2, "left"));

        task31();
        task32();
        task33();
        task34();
    }  
}