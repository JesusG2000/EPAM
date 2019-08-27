package by.etc.basic_oop.task_four.cave;

import by.etc.basic_oop.task_four.dragon.Dragon;
import by.etc.basic_oop.task_four.treasures.Treasure;

public class Cave {
private Treasure[] treasures;
private Dragon dragon;
private String name;

    public Cave(Treasure[] treasures, Dragon dragon, String name) {
        this.treasures = treasures;
        this.dragon = dragon;
        this.name = name;
    }
    public void showTreasures(){
        for(Treasure t: treasures){
            System.out.println(t.toString());
        }
    }
   public double getMostExpencive(){
        double max=0;
        for(Treasure t: treasures){
            max=Math.max(max,t.getCount()*t.getSize());
        }
        return max;
    }
  public   void treasuresBySomeCost(int cost){
        boolean isFind=false;
        for(int i =0 ;i<treasures.length ; i++){
            if(treasures[i].getSize()*treasures[i].getCount()==cost){
                isFind=true;
                System.out.println(treasures[i].toString());
            }
        }
        if(!isFind){
            System.out.println("Nothing");
        }
    }
}
