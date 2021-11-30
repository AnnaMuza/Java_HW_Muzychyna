package CW12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


public class Bin_files_1a {
    public static void createFile(String filename) {
        File newFile = new File(filename + ".dat");
        try {
            boolean created = newFile.createNewFile();
            if (created) System.out.println("File has been created");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        String filename = "test_2";
        int n = 5;
        createFile(filename);
        double sum = 0;
        Random r = new Random();

        try {
            DataInputStream in = new DataInputStream(new FileInputStream(filename + ".dat"));
            DataOutputStream out = new DataOutputStream(new FileOutputStream(filename + ".dat"));

            for (int i = 0; i < n; i++) {
                double number = 10 + 20*r.nextDouble();
                System.out.println(number);
                out.writeDouble(number);
            }

            while (true) sum += in.readDouble();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sum);
    }
}