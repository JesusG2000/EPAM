package by.etc.basic_oop.task_five_a.flower;

import java.io.IOException;

public class RoseFlowerMaker implements FlowerMaker {
    @Override
    public Flower createFlower() {
        return new Rose();
    }
}
