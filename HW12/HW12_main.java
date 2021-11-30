package HW12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;


public class HW12_main {
    // а)
    public static boolean sameNameAll(String[] arr) {
        Set<String> sur = new HashSet<String>();
        for (String i : arr) sur.add(i.split("\\s+")[1]);

        return sur.size() != arr.length;
    }


    // б)
    public static boolean sameNamePar(String[] arr) {
        Set<String> sur = new HashSet<String>();
        String[] a;

        for (String i : arr) {
            a = i.split("\\s+");
            sur.add(a[1] + a[2]);
        }

        return sur.size() != arr.length;
    }


    // в)
    public static boolean sameNameClass(String[] arr) {
        Set<String> sur = new HashSet<String>();
        String[] a;
        
        for (String i : arr) {
            a = i.split("\\s+");
            sur.add(a[1] + a[2] + a[3]);
        }

        return sur.size() != arr.length;
    }


    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("students.txt");
        Scanner sc = new Scanner(fr);
        String text = sc.useDelimiter("\\A").next();
        fr.close();
        sc.close();

        String[] arr = text.split("\n");

        System.out.println(sameNameAll(arr));
        System.out.println(sameNamePar(arr));
        System.out.println(sameNameClass(arr));
    }
}