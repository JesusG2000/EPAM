package by.etc.programming_with_class.class_object.task_six;
// Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
// изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
// В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.
public class Time {

    int hour;
    int min;
    int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Time() {
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    void changeBySec(int sec) {
        int hour = sec / 3600;
        sec -= 3600 * hour;
        int min = sec / 60;
        sec -= 60 * min;
        setTime(hour + this.hour, min + this.min, sec + this.sec);

    }

    void changeByMin(int min) {
        int hour = min / 60;
        min -= 60 * hour;
        setTime(hour + this.hour, min + this.min, this.sec);

    }

    void changeByHour(int hour) {
        setTime(hour + this.hour, this.min, this.sec);

    }

    void setTime(int hour, int min, int sec) {
        if (checkHour(hour)) {
            setHour(hour);
        } else {
            setHour(0);
        }
        if (checkMin(min)) {
            setMin(min);
        } else {
            setMin(0);
        }
        if (checkSec(sec)) {
            setSec(sec);
        } else {
            setSec(0);
        }
    }

    void showTime() {
        System.out.println(hour + "." + min + "." + sec);
    }

    boolean checkHour(int hour) {
        return hour >= 0 && hour <= 23;
    }

    boolean checkMin(int min) {
        return min >= 0 && min <= 59;
    }

    boolean checkSec(int sec) {
        return sec >= 0 && sec <= 59;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public static void main(String[] args) {
        Time time = new Time();
        time.showTime();

    }
}
