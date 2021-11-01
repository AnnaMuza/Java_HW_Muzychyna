import java.util.*;


class Customer implements Comparable<Customer> {
    private int id;
    private String name;
    private String adress;
    private int card;
    private int bank;

    public Customer() {}

    public Customer(int id, String name, String adress, int card, int bank) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.card = card;
        this.bank = bank;
    }

    public void input(Scanner console) {
        System.out.print("Enter id: ");
        this.id = console.nextInt();
        System.out.print("Enter name: ");
        this.name = console.nextLine();
        System.out.print("Enter adress: ");
        this.name = console.nextLine();
        System.out.print("Enter card number: ");
        this.card = console.nextInt();
        System.out.print("Enter bank account: ");
        this.bank = console.nextInt();
    }

    @Override
	public int compareTo(Customer e) {
		return this.getName().compareTo(e.getName());
	}

    public String toString() {
        return String.format("Customer:\nname - %s\nadress - %s\ncard number - %d\nbank account - %d\n", this.name, this.adress, this.card, this.bank);
    }

    public void show() {
        System.out.println(toString());
    }

    public String getName() {
        return this.name;
    }

    public String getAdress() {
        return this.adress;
    }

    public int getCard() {
        return this.card;
    }

    public int getBank() {
        return this.bank;
    }
}


// 2.2
public class HW7 {

    static Scanner console = new Scanner(System.in);

    // a)
    static void alphabet(Customer[] cus) {
        System.out.println("List of customers in alphabetical order:\n");
        ArrayList<Customer> cus_copy = new ArrayList<>(Arrays.asList(cus));
        Collections.sort(cus_copy);
        for (Customer c: cus_copy) c.show();
    }

    // b)
    static void card_interval(Customer[] cus, int a, int b) {
        System.out.printf("List of customers whose card number is in the specified interval from %d to %d:\n\n", a, b);
        for (Customer c: cus) if (c.getCard() > a && c.getCard() < b) c.show();
    }


    public static void main(String[] args) {
        int N = 3;
        Customer[] cus = new Customer[N];

        // for (int i = 0; i < N; i++){
        //     cus[i] = new Customer();
        //     cus[i].input(console);
        // }

        cus[0] = new Customer(123, "Toni Heaton", "adress1", 1234, 0001);
        cus[1] = new Customer(345, "Irene Hudson", "adress2", 1235, 0002);
        cus[2] = new Customer(203, "Keenan Wilson", "adress3", 1236, 0003);

        alphabet(cus);
        card_interval(cus, 1111, 1235);
    }
}
