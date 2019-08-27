package by.etc.basic_oop.task_five_a.flower;

import java.util.Objects;

public class Dandelion implements Flower {
    @Override
    public String toString() {
        return "Candy{}";
    }
//    private String color;
//    private int count;
//
//    public Candy(String color, int count) {
//        this.color = color;
//        this.count = count;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Candy)) return false;
//        Candy dandelion = (Candy) o;
//        return count == dandelion.count &&
//                Objects.equals(color, dandelion.color);
//    }
//
//    @Override
//    public String toString() {
//        return "Candy{" +
//                "color='" + color + '\'' +
//                ", count=" + count +
//                '}';
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(color, count);
//    }
}
