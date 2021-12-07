package CW13.Salon;


public class Salon_main {
    public static void print_client(Salon salon) {
        for (Client c : salon.clients) System.out.println(c);
    }

    public static void main(String[] args) {
        Salon salon = new Salon();
        salon.add_client(new Client("Ivanov Ivan", "305128", new String[] {"89112223355"}));
        salon.add_client(new Client("Ivanov Ivan", "305002", new String[] {"89112223356"}));
        salon.add_client(new Client("Ivanov Ivan", "305128", new String[] {"89112223388"}));
        salon.add_client(new Client("Ivanov Ivan", "305128", new String[] {"89112223899"}));
        salon.add_client(new Client("Ivanov Ivan", "305128", new String[] {"89112223800"}));

        print_client(salon);
    }
}