package CW7.task_21;
import java.util.*;


public class Student {
    private int id;
    private String name;
    private int course;
    private String faculty;
    private String date;

    public Student() {}

    public Student(int id, String name, int course, String faculty, String date) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.faculty = faculty;
        this.date = date;
    }

    public void input(Scanner console){
        System.out.print("Enter id: ");
        this.id = console.nextInt();
        System.out.print("Enter course: ");
        this.course = console.nextInt();
        System.out.print("Enter name: ");
        this.name = console.nextLine();
        System.out.print("Enter faculty: ");
        this.faculty = console.nextLine();
        System.out.print("Enter date: ");
        this.date = console.nextLine();
    }

    public String to_string(){
        return String.format("Student:\nname - %s\ncourse - %d\nfaculty - %s\ndate of birth - %s\n", this.name, this.course, this.faculty, this.date);
    }

    public void show(){
        System.out.println(to_string());
    }

    public String get_faculty(){
        return this.faculty;
    }

    public int get_course(){
        return this.course;
    }

    public String get_date(){
        return this.date;
    }
}
