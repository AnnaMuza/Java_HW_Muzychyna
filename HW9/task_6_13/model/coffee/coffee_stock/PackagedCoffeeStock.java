package HW9.task_6_13.model.coffee.coffee_stock;
import HW9.task_6_13.model.coffee.PackagedCoffee;


public class PackagedCoffeeStock {

    private int mNumber;
    private PackagedCoffee mPackagedCoffee;

    public PackagedCoffeeStock(PackagedCoffee pPackagedCoffee, int pNumber) {
        mPackagedCoffee = pPackagedCoffee;
        mNumber = pNumber;
    }

    public PackagedCoffee getPackagedCoffee() {
        return mPackagedCoffee;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int mNumber) {
        this.mNumber = mNumber;
    }
}
