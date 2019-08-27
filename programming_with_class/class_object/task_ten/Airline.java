package by.etc.programming_with_class.class_object.task_ten;
// Создать класс Airline, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
// Найти и вывести:
// Test) список рейсов для заданного пункта назначения;
// b) список рейсов для заданного дня недели;
// c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
public class Airline {
  private   String destination;
  private   int flightNumber;
  private   String planeType;
  private   int hour;
  private   int min;
  private   int dayOfWeek;

    public Airline(String destination, int flightNumber, String planeType, int hour, int min, int dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.hour = hour;
        this.min = min;
        this.dayOfWeek = dayOfWeek;
    }

    public Airline() {
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", PlaneType='" + planeType + '\'' +
                ", hour=" + hour +
                ", min=" + min +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getflightNumber() {
        return flightNumber;
    }

    public void setflightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        planeType = planeType;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
