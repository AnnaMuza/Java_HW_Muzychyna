package HW9.task_6_13.model.coffee;
import HW9.task_6_13.model.coffee.coffee_type.Coffee;
import HW9.task_6_13.model.packaging.Packaging;


public class PackagedCoffee {

    private Coffee mCoffee;
    private Packaging mPackaging;
    private double mProductWeight;
    private double mPrice;

    public Coffee getCoffee() {
        return mCoffee;
    }

    public Packaging getPackaging() {
        return mPackaging;
    }

    public double getProductWeight() {
        return mProductWeight;
    }

    public double getPrice() {
        return mPrice;
    }

    public double getPriceWeightQuality(){
        return this.getProductWeight() / this.getPrice();
    }

    public PackagedCoffee(Coffee pCoffee, Packaging pPackaging) {
        mCoffee = pCoffee;
        mPackaging = pPackaging;
        mProductWeight = pPackaging.getSize().getSizeValue() * pCoffee.getWeightPerVolumeUnit();
        mPrice = pCoffee.getPricePerGr() * mProductWeight + pPackaging.getType().getPriceModifier() * 100;
    }

    @Override
    public String toString() {
        return String.join(" ", mCoffee.toString(), mPackaging.toString(), String.valueOf(mPrice), String.valueOf(mPackaging.getVolume()), String.valueOf(getPriceWeightQuality()));
    }
}
