package CW13.Salon;

import java.util.Arrays;


public class Client {
    public String name;
    public String pass_number;
    public String[] phone_numbers;

    Client() {}

    Client(String name, String pass_number, String[] phone_numbers){
        this.name = name;
        this.pass_number = pass_number;
        this.phone_numbers = phone_numbers;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", name, pass_number, Arrays.toString(this.phone_numbers));
    }
}