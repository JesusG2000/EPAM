package by.etc.programming_with_class.aggregation_and_composition.task_five;

public class Trip {
  private   String type;
  private   String transport;
  private boolean food;
  private   int days;
  private boolean selected;

     Trip(String type, String transport, boolean food, int days, boolean selected) {
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.days = days;
        this.selected = selected;
    }

     void setTransport(String transport) {
        this.transport = transport;
    }

     void setFood(boolean food) {
        this.food = food;
    }

     int getDays() {
        return days;
    }

     void setDays(int days) {
        this.days = days;
    }

     void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", food=" + food +
                ", days=" + days +
                ", selected=" + selected +
                '}';
    }
}
