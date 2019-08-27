package by.etc.basic_oop.task_five_a.flower_compositon;

import by.etc.basic_oop.task_five_a.box.Box;
import by.etc.basic_oop.task_five_a.box.BoxMaker;
import by.etc.basic_oop.task_five_a.box.OvalBoxMaker;
import by.etc.basic_oop.task_five_a.box.RectengularBoxMaker;
import by.etc.basic_oop.task_five_a.flower.DandelionFlowerMaker;
import by.etc.basic_oop.task_five_a.flower.Flower;
import by.etc.basic_oop.task_five_a.flower.FlowerMaker;
import by.etc.basic_oop.task_five_a.flower.RoseFlowerMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class FlowerComposition {
   private Box box;
   private ArrayList<Flower> flowers;


   public FlowerComposition() {
      flowers = new ArrayList<>(100);

   }

   public void addFlowers(int count, String name) {
      FlowerMaker maker = getFlowerMaker(name);
      for (int i = 0; i < count; i++) {
         flowers.add(maker.createFlower());
      }
   }

   private FlowerMaker getFlowerMaker(String name) {
      switch (name.toLowerCase()) {
         case "rose": {
            return new RoseFlowerMaker();
         }
         case "dandelion": {
            return new DandelionFlowerMaker();
         }
         default: {
            throw new IllegalArgumentException();
         }
      }
   }

   private BoxMaker getBoxMaker(String name) {
      switch (name.toLowerCase()) {
         case "oval": {
            return new OvalBoxMaker();
         }
         case "rectengular": {
            return new RectengularBoxMaker();
         }
         default: {
            throw new IllegalArgumentException();
         }
      }
   }

   public void addBox(String name) {
      BoxMaker boxMaker = getBoxMaker(name);
      box = boxMaker.createBox();
   }

   @Override
   public String toString() {
      return "Present{" +
              "box=" + box +
              ", flowers=" + flowers +
              '}';
   }
}
