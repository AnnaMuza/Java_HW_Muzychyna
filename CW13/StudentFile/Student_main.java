package CW13.StudentFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Objects;


public class Student_main {
    public static void write_file(String filename, Student[] students) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(students);
        oos.close();
    }


    public static void read_file_student(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        Student ia = (Student) (ois.readObject());
        System.out.println("Data in " + filename + ":");
        System.out.println(ia);
        ois.close();
    }


    public static void read_file_students(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        Student[] f = (Student[]) (ois.readObject());
        System.out.println("Data in " + filename + ":");
        for (Student s : f) System.out.println(s);
        System.out.println();
        ois.close();
    }


    public static Student[] add_student(Student[] students, Student student) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;

        return students;
    }


    public static void find_by_name_write(String filename, String name) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        Student[] students = (Student[]) (ois.readObject());
        
        for (Student s: students) {
            if (Objects.equals(s.get_name(), name)) {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name + ".dat"));
                oos.writeObject(s);
                oos.close();
                break;
            }
        }
        ois.close();
    }


    public static void find_worst(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        Student[] students = (Student[]) (ois.readObject());
        Student worst = students[0];
        for (Student s: students) if (s.average_mark() < worst.average_mark()) worst = s;

        System.out.println("Worst student:");
        System.out.println(worst);

        ois.close();
    }


    public static void main(String[] args) {
        try {
            Student[] students = new Student[] {new Student("19", "Dilan", 6, new int[] {5, 4, 5, 3, 5, 5}),
                                                new Student("13", "Erika", 5, new int[] {5, 4, 3, 4, 5, 3}),
                                                new Student("15", "Richard", 4, new int[] {4, 4, 3, 3, 4, 3}),
                                                new Student("17", "Asiya", 5, new int[] {5, 4, 3, 5, 4, 4})};
            write_file("students.dat", students);
            read_file_students("students.dat");

            students = add_student(students, new Student("18", "Jordan", 6, new int[] {5, 4, 5, 4, 5, 4}));
            write_file("students.dat", students);
            read_file_students("students.dat");
            String name = "Jordan";

            find_by_name_write("students.dat", name);
            read_file_student(name + ".dat");

            System.out.println();
            find_worst("students.dat");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}