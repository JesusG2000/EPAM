package by.etc.programming_with_class.aggregation_and_composition.task_three;

public class State {
  private   String name;
   private int capital;
  private   Region[] regions;

    public State(String name, int capital, Region[] regions) {
        this.name = name;
        this.capital = capital;
        this.regions = regions;
    }

    void stateArea(){
        double area=0;
        for(Region r :regions){
            area+=r.getArea();
        }
        System.out.println("area = "+area);
    }
    void countOfRegions(){
        System.out.println(regions.length);
    }

    public String getCapital() {
        return regions[capital].getName();
    }
    void regionsCenters(){
        for(Region r:regions){
            System.out.println(r.getRegionCenter());
        }
    }
}
