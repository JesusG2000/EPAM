package by.etc.basic_oop.task_five_b.present;

import by.etc.basic_oop.task_five_b.box.Box;
import by.etc.basic_oop.task_five_b.box.BoxMaker;
import by.etc.basic_oop.task_five_b.box.OvalBoxMaker;
import by.etc.basic_oop.task_five_b.box.RectengularBoxMaker;
import by.etc.basic_oop.task_five_b.sweet.CandySweetMaker;
import by.etc.basic_oop.task_five_b.sweet.Sweet;
import by.etc.basic_oop.task_five_b.sweet.SweetMaker;
import by.etc.basic_oop.task_five_b.sweet.CakeSweetMaker;

import java.util.ArrayList;

public class Present {
   private Box box;
   private ArrayList<Sweet> sweets;


   public Present() {
      sweets = new ArrayList<>(100);

   }

   public void addSweets(int count, String name) {
      SweetMaker maker = getSweetMaker(name);
      for (int i = 0; i < count; i++) {
         sweets.add(maker.createSweet());
      }
   }

   private SweetMaker getSweetMaker(String name) {
      switch (name.toLowerCase()) {
         case "cake": {
            return new CakeSweetMaker();
         }
         case "candy": {
            return new CandySweetMaker();
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
              ", sweets=" + sweets +
              '}';
   }
}
