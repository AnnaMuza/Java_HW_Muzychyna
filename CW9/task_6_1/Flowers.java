package CW9.task_6_1;


class Rose extends Flower {
    public Rose() {
        super();
    }

    public Rose(float p, String c, float U, String d) {
        super(p, c, U, d);
    }

    @Override
    public String toString() {
        return String.format("Rose color: %s, price: %.2f, length: %.1f, date: %s\n" , super.color, super.price, super.length, super.date);
    }
}

class Daisy extends Flower {
    public Daisy() {
        super();
    }

    public Daisy(float p, String c, float U, String d) {
        super(p, c, U, d);
    }

    @Override
    public String toString() {
        return String.format("Daisy color: %s, price: %.2f, length: %.1f, date: %s\n" , super.color, super.price, super.length, super.date);

    }
}

class Lily extends Flower{
    public Lily() {
        super();
    }

    public Lily(float p, String c, float U, String d) {
        super(p, c, U, d);
    }

    @Override
    public String toString() {
        return String.format("Lily color: %s, price: %.2f, length: %.1f, date: %s\n" , super.color, super.price, super.length, super.date);
    }
}