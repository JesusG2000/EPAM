package by.etc.basic_oop.task_four.treasures;

public abstract class Treasure {
    private int count;
    private int size;
    private String name;

    public Treasure(int count, int size, String name) {
        this.count = count;
        this.size = size;
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "count=" + count +
                ", size=" + size +
                ", name='" + name + '\'';
    }
}
