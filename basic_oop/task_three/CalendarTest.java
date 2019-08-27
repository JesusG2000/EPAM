package by.etc.basic_oop.task_three;



//Создать класс Календарь с внутренним классом,
// с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
public class CalendarTest {
    public static void main(String[] args) {
        Calendar.Holiday[] holidays=new Calendar.Holiday[3];
        holidays[0]=new Calendar.Holiday("8 March",8,2);
        holidays[1]=new Calendar.Holiday("New Year",31,11);
        holidays[2]=new Calendar.Holiday("Friend Birthday",22,4);

        Calendar calendar=new Calendar(holidays);
        calendar.showHolidays();
    }
}
