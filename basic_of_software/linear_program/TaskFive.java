package by.etc.basic_of_software.linear_program;

public class TaskFive {
    //Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    //данное значение длительности в часах, минутах и секундах в следующей форме:
    //ННч ММмин SSc.
    public static void main(String[] args) {
        int number;
        int hour;
        int min;
        int sec;

        number=166619;

        hour=number/3600;
        number-=3600*hour;
        min=number/60;
        number-=60*min;
        sec=number;

        System.out.println("HH"+hour+" MM"+min+" SS"+sec);


    }
}
