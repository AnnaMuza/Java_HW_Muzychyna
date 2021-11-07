package HW9.task_5_10;


public class Dog extends Animal {
    Dog() { super(); };
    
    public void bite() {
        System.out.println("Ouch");
    }

    public void speak() {
        System.out.println("woof woof!");
    }
}