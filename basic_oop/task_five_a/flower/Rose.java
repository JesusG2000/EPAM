package by.etc.basic_oop.task_five_a.flower;

import java.util.Objects;

public class Rose implements Flower {
    @Override
    public String toString() {
        return "Cake{}";
    }
    //   private String color;
//    private int count;
//
//    public Cake(String color, int count) {
//        this.color = color;
//        this.count = count;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Cake)) return false;
//        Cake rose = (Cake) o;
//        return count == rose.count &&
//                Objects.equals(color, rose.color);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(color, count);
//    }
//
//    @Override
//    public String toString() {
//        return "Cake{" +
//                "color='" + color + '\'' +
//                ", count=" + count +
//                '}';
//    }
//}
}
