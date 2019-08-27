package by.etc.programming_with_class.aggregation_and_composition.task_three;

public class City {
   private String name;
   private District[] districts;

    public City(String name, District[] districts) {
        this.name = name;
        this.districts = districts;
    }
}
