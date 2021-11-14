package HW10.task_7_8;


public class CargoShip implements Ship {
    private String name;
    private int length, deadweight;

    CargoShip() {}

    CargoShip(String name, int length, int deadweight) {
        this.name = name;
        this.length = length;
        this.deadweight = deadweight;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setLength(int l) {
        this.length = l;
    }

    public void setDeadweight(int d) {
        this.deadweight = d;
    }

    public String getName() {
        return this.name;
    }

    public int getLength() {
        return this.length;
    }

    public int getDeadweight() {
        return this.deadweight;
    }

    @Override
    public String toString() {
        return String.format("Cargo ship %s:\nLength = %d m\nDeadweight = %d DWT\n", name, length, deadweight);
    }
}