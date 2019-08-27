package by.etc.programming_with_class.aggregation_and_composition.task_four;

public class Bill {
    private int value;
    private boolean isBlock;
    private int index;

    public Bill(int value, boolean isBlock, int index) {
        this.value = value;
        this.isBlock = isBlock;
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public int getIndex() {
        return index;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "value=" + value +
                ", isBlock=" + isBlock +
                ", index=" + index +
                '}';
    }
}
