package by.etc.programming_with_class.class_object.task_five;

public class Counter {
    int begin;
    int end;
    int value;

    public Counter() {
        this.begin=0;
        this.end=10;
        this.value=0;
    }

    public Counter(int begin, int end, int value) {
        if (begin > end || begin + 10 != end) {
            while (begin + 10 != end) {
                end++;
            }
        }
        if (value >= begin && end <= value) {
            this.value = value;
        } else {
            this.value = begin;
        }
        this.begin = begin;
        this.end = end;
    }
    public void increment() {
        if (value != end) {
            value++;
        }
    }
    public void decrement(){
        if(value!=begin) {
            value--;
        }
    }
    public int getValue(){
        return value;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    public static void main(String[] args) {
        Counter counter = new Counter(1,5,9);
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println("value = " + counter.getValue());
        System.out.println("begin = " + counter.getBegin());
        System.out.println("end = " + counter.getEnd());
    }
}
