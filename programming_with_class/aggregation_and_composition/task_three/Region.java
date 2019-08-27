package by.etc.programming_with_class.aggregation_and_composition.task_three;

public class Region {
    public String getName() {
        return name;
    }

    private   String name;
   private City[] cities;
   private double area;
   private String regionCenter;

    public Region(String name,String regionCenter, City[] cities,double area) {
        this.regionCenter=regionCenter;
        this.area=area;
        this.name = name;
        this.cities = cities;
    }

    public double getArea() {
        return area;
    }

    public String getRegionCenter() {
        return regionCenter;
    }
}
