package HW9.task_5_10;


public class Puppy extends Dog {
    private String name;
    
    Puppy() { super(); }
    Puppy(String name) {
        super();
        this.name = name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void print_name() {
        System.out.println(name);
    }
}