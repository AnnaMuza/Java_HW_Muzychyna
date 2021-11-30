package CW12;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Text_files_1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("test_1.txt");
        Scanner sc = new Scanner(fr);
        String text = sc.useDelimiter("\\A").next();
        fr.close();
        sc.close();

        FileWriter fw = new FileWriter("H.txt");
        String temp;
        
        // a)
        String longest = Arrays.stream(text.split("\\s+")).max(Comparator.comparingInt(String::length)).orElse(null);
        temp = "a)\n" + longest + "\n";
        System.out.println(temp);
        fw.write(temp);

        //б)
        temp = "б)\n" + text.split("\\s+").length + "\n";
        System.out.println(temp);
        fw.write(temp);

        // в)
        String text1 = text.replaceAll("\\s\\w{1}\\b", "");
        text1 = text1.replaceAll("\\s{2,}", " ");
        temp = "в)\n" + text1 + "\n";
        System.out.println(temp);
        fw.write(temp);

        // г)
        String[] arr = text.split("\\.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
            arr[i] = arr[i].replaceAll("\\s{2,}", " ");
            
        }
        temp = "г)\n" + String.join(". ", arr) + "\n";
        System.out.println(temp);
        fw.write(temp);

        fw.close();
    }
}