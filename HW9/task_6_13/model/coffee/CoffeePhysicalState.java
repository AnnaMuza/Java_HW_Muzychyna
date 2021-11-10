package HW9.task_6_13.model.coffee;


public enum CoffeePhysicalState {
    COFFEE_BEANS(1), GROUND_COFFEE(2), INSTANT_COFFEE(3);
    private int mMarkupPerGr;

    CoffeePhysicalState(int pMarkupPerGr) {
        mMarkupPerGr = pMarkupPerGr;
    }

    public int getMarkupPerGr() {
        return mMarkupPerGr;
    }
}
