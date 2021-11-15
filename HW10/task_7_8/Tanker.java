package HW10.task_7_8;


public class Tanker extends CargoShip {
    private String dwt_class, cargo;

    Tanker() {}

    Tanker(String name, int length, int deadweight) {
        super(name, length, deadweight);
    }

    Tanker(String name, int length, int deadweight, String dwt_class, String cargo) {
        this(name, length, deadweight);
        setDWTClass(dwt_class);
        setCargo(cargo);
    }

    public void setDWTClass(String c) {
        this.dwt_class = c;
    }

    public void setCargo(String c) {
        this.cargo = c;
    }

    public String getDWTClass() {
        return this.dwt_class;
    }

    public String getCargo() {
        return this.cargo;
    }

    @Override
    public String toString() {
        return String.format("Tanker %s (%s class):\nCargo type: %s\nLength = %d m\nDeadweight = %d DWT\n", getName(), getDWTClass(), getCargo(), getLength(), getDeadweight());
    }
}