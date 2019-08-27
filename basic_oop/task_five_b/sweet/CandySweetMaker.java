package by.etc.basic_oop.task_five_b.sweet;

public class CandySweetMaker implements SweetMaker {
    @Override
    public Sweet createSweet() {
        return new Candy();
    }
}
