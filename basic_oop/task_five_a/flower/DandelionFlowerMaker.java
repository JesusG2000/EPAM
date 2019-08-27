package by.etc.basic_oop.task_five_a.flower;

public class DandelionFlowerMaker implements FlowerMaker {
    @Override
    public Flower createFlower() {
        return new Dandelion();
    }
}
