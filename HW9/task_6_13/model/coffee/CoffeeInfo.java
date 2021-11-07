package HW9.task_6_13.model.coffee;


public class CoffeeInfo {

    private String mName;
    private CoffeePhysicalState mPhysicalState;
    private CoffeeQuantity mQuantity;

    public CoffeeInfo(String pName, CoffeePhysicalState pPhysicalState, CoffeeQuantity pQuantity) {
        mName = pName;
        mPhysicalState = pPhysicalState;
        mQuantity = pQuantity;
    }

    public String getName() {
        return mName;
    }

    public CoffeePhysicalState getPhysicalState() {
        return mPhysicalState;
    }

    public CoffeeQuantity getQuantity() {
        return mQuantity;
    }

    public double pricePerGr() {
        return (double) (mPhysicalState.getMarkupPerGr() + mQuantity.getPricePerGr());
    }

    public double weightPerVolumeUnit() {
        if (mPhysicalState == CoffeePhysicalState.COFFEE_BEANS) {
            return 100;
        } else {
            return mPhysicalState == CoffeePhysicalState.INSTANT_COFFEE ? 200 : 150;
        }
    }

    @Override
    public String toString() {
        return String.join(" ", mName, mPhysicalState.name(), mQuantity.name());
    }
}
