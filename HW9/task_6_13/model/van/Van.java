package HW9.task_6_13.model.van;
import HW9.task_6_13.model.coffee.coffee_stock.PackagedCoffeeStock;
import java.util.ArrayList;


public class Van {

    private int mUsefulVolume;
    private ArrayList<PackagedCoffeeStock> mCargo;

    public ArrayList<PackagedCoffeeStock> getCargo() {
        return mCargo;
    }

    public int getUsefulVolume() {
        return mUsefulVolume;
    }

    public Van(int pUsefulVolume) {
        mUsefulVolume = pUsefulVolume;
        mCargo = new ArrayList<>();
    }
}
