package HW9.task_5_10;


public class Task_5_10 {
    public static void main(String[] args) {
        Puppy jack = new Puppy("Jack");
        System.out.print("Puppy's name is: ");
        jack.print_name();
        System.out.print("Jack is ");
        jack.jump();
        System.out.print("Jack is ");
        jack.run();
        System.out.print("Jack makes ");
        jack.speak();
        System.out.println("Jack bit");
        jack.bite();
    }
}