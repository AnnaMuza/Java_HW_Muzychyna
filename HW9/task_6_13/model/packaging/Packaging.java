package HW9.task_6_13.model.packaging;


public class Packaging {

    private PackagingType mType;
    private PackagingSize mSize;
    private int mVolume;

    public Packaging(PackagingType pType, PackagingSize pSize) {
        mType = pType;
        mSize = pSize;
        mVolume = mType.getVolumeModifier() + mSize.getSizeValue();
    }

    public PackagingType getType() {
        return mType;
    }

    public PackagingSize getSize() {
        return mSize;
    }

    public int getVolume() {
        return mVolume;
    }

    public int getPrice() {
        return this.getVolume() + mType.getPriceModifier() * 2;
    }

    @Override
    public String toString() {
        return String.join(" ", mType.name(), mSize.name());
    }
}
