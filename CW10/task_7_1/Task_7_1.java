package CW10.task_7_1;


public class Task_7_1 {
    public static void main(String[] args) {
        Dictionary d1 = new Dictionary("Dictionary", 1000, "A1, B1", 123.45f, "english", "rus", 100000);
        Encyclopedy e1 = new Encyclopedy("Encyclopedy", 10000, "R1", 1123.45f, 100000);

        System.out.println(d1);
        System.out.println(e1);
    }
}
