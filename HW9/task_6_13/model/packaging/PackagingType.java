package HW9.task_6_13.model.packaging;


public enum PackagingType {
    GLASS(1, 2), PAPER(0, 1);
    private int mVolumeModifier;
    private int mPriceModifier;

    PackagingType(int pVolumeModifier, int pPriceModifier) {
        mVolumeModifier = pVolumeModifier;
        mPriceModifier = pPriceModifier;
    }

    public int getPriceModifier() {
        return mPriceModifier;
    }

    public int getVolumeModifier() {
        return mVolumeModifier;
    }
}
