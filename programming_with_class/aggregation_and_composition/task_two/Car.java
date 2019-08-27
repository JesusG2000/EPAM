package by.etc.programming_with_class.aggregation_and_composition.task_two;
// Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
public class Car {
private Engine engine;
private String mark;
private Wheel[] wheels;

    public Car(String mark) {
        engine= new Engine();
        wheels=new Wheel[4];
       for(int i = 0 ; i  <wheels.length ; i++){
           wheels[i]=new Wheel();
       }
    }

    public String getMark() {
        return mark;
    }
    void drive(){
        System.out.println("Drive");
    }
    void refuel(){
        System.out.println("refuel");
    }
    void changeWheel(Wheel wheel , int index){
        wheels[index]=wheel;
    }
}
