package CW13.StudentFile;

import java.util.Arrays;
import java.io.Serializable;


public class Student implements Serializable {
    private String number;
    private String name;
    private int pass;
    private int[] marks;


    public Student() {
        this.number = "";
        this.name = "name";
        this.pass = 0;
        this.marks = new int[] {0, 0, 0, 0, 0, 0};
    }


    public Student(String number, String name, int pass, int[] marks) {
        this.number = number;
        this.name = name;
        this.pass = pass;
        this.marks = marks;
    }


    public String get_name() {
        return name;
    }


    public int average_mark(){
        int average = 0;
        for (int m: marks) average += m;

        return average/6;
    }


    @Override
    public String toString(){
        return String.format("№ %s, %s, %d: %s", number, name, pass, Arrays.toString(marks));
    }
}