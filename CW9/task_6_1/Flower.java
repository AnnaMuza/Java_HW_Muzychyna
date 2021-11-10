package CW9.task_6_1;


public class Flower implements Comparable<Flower> {
    public float price;
    public String color;
    public float length;
    public String date;

    public Flower() {}

    public Flower(float p, String c, float l, String s) {
        this.price = p;
        this.color = c;
        this.length = l;
        this.date = s;
    }

    @Override
    public int compareTo(Flower o) {
        return this.date.compareTo(o.date);
    }
}