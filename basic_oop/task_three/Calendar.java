package by.etc.basic_oop.task_three;

public class Calendar {
   private Holiday[]holidays;

    public Calendar(Holiday[] holidays) {
        this.holidays = holidays;
    }
    void showHolidays(){
        for(Holiday h:holidays){
            System.out.println(h.toString());
        }
    }

    static class Holiday{
       private String name;
       private int day;
       private int month;

        public Holiday(String name, int day, int month) {
            this.name = name;
            this.day = day;
            this.month = month;
        }

        @Override
        public String toString() {
            return "holiday{" +
                    "name='" + name + '\'' +
                    ", day=" + day +
                    ", month=" + month +
                    '}';
        }
    }

}
