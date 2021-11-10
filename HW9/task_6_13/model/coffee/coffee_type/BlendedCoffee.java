package HW9.task_6_13.model.coffee.coffee_type;
import HW9.task_6_13.model.coffee.CoffeeInfo;


public class BlendedCoffee extends Coffee {

    CoffeeInfo mSecondaryCoffeeInfo;

    public BlendedCoffee(String pProductName, CoffeeInfo pFirstCoffeeInfo, CoffeeInfo pSecondaryCoffeeInfo) {
        super(pProductName,
                (pFirstCoffeeInfo.pricePerGr() + pSecondaryCoffeeInfo.pricePerGr()) / 2.0,
                (pFirstCoffeeInfo.weightPerVolumeUnit() + pSecondaryCoffeeInfo.weightPerVolumeUnit()) / 2.0,
                pFirstCoffeeInfo);
        this.mSecondaryCoffeeInfo = pSecondaryCoffeeInfo;
    }

    @Override
    public String toString() {
        return String.join(" ", super.toString(), mSecondaryCoffeeInfo.toString());
    }
}
