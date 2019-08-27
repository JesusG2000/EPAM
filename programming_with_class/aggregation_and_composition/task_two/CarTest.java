package by.etc.programming_with_class.aggregation_and_composition.task_two;
//// Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
//// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("volga");
        car.drive();
        System.out.println(car.getMark());
        car.refuel();
        car.changeWheel(new Wheel(),1);
    }
}
