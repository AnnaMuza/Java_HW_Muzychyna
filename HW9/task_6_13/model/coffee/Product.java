package HW9.task_6_13.model.coffee;


public class Product {
    private String mProductName;
    private double mPricePerGr;
    private double mWeightPerVolumeUnit;
    public Product(String pProductName, double pPricePerGr, double pWeightPerVolumeUnit) {
        mProductName = pProductName;
        mPricePerGr = pPricePerGr;
        mWeightPerVolumeUnit = pWeightPerVolumeUnit;
    }

    public String getProductName() {
        return mProductName;
    }

    public double getPricePerGr() {
        return mPricePerGr;
    }

    public double getWeightPerVolumeUnit() {
        return mWeightPerVolumeUnit;
    }
}
