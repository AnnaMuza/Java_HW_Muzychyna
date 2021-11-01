package CW7.task_15.debug;

public class Class_debug {
    public static void debug(String ... args){
        for (String s : args){
            System.out.printf("%s ", s);
        }
    }
}