package HW9.task_6_13.model.coffee;


public enum CoffeeQuantity {
    AA(4), AB(3), BA(2), BB(1);
    private int mPricePerGr;

    CoffeeQuantity(int pPricePerGr) {
        mPricePerGr = pPricePerGr;
    }

    public int getPricePerGr() {
        return mPricePerGr;
    }
}
