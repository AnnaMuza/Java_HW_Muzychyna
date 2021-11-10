package CW9.task_5_1;


public class Task_5_1 {
    public static void main (String[] args) {
        Text text = new Text(new String[] {"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                                          "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                                          "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."});
        text.set_header(new Sentence("HEADER"));
        text.print_header();
        System.out.println(text);
    }
}