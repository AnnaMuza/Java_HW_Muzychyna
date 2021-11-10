package HW9.task_6_13.model.packaging;


public enum PackagingSize {
    LARGE(3), MEDIUM(2), SMALL(1);
    private int mSize;

    PackagingSize(int pSize) {
        mSize = pSize;
    }

    public int getSizeValue() {
        return mSize;
    }

}
