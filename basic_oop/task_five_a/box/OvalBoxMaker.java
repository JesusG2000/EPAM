package by.etc.basic_oop.task_five_a.box;

public class OvalBoxMaker implements BoxMaker {
    @Override
    public Box createBox() {
            return new Oval();


    }
}
