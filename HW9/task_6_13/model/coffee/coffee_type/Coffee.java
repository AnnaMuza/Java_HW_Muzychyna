package HW9.task_6_13.model.coffee.coffee_type;
import HW9.task_6_13.model.coffee.CoffeeInfo;
import HW9.task_6_13.model.coffee.Product;


public class Coffee extends Product {

    public CoffeeInfo mCoffeeInfo;

    public Coffee(String pProductName, CoffeeInfo pCoffeeInfo) {
        super(pProductName, pCoffeeInfo.pricePerGr(), pCoffeeInfo.weightPerVolumeUnit());
        this.mCoffeeInfo = pCoffeeInfo;
    }

    public Coffee(String pProductName, double pPricePerGr, double pWeightPerVolumeUnit, CoffeeInfo pCoffeeInfo) {
        super(pProductName, pPricePerGr, pWeightPerVolumeUnit);
        this.mCoffeeInfo = pCoffeeInfo;
    }

    public CoffeeInfo getCoffeeInfo() {
        return mCoffeeInfo;
    }

    @Override
    public String toString() {
        return String.join(" ", this.getProductName(), mCoffeeInfo.toString());
    }
}
