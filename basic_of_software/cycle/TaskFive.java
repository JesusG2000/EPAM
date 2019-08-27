package by.etc.basic_of_software.cycle;

import java.util.Scanner;

public class TaskFive {
    //. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
    // модуль которых больше или равен заданному е. Общий член ряда имеет вид:

    public static void main(String[] args) {

        double number;
        double sum;

        number=0.0115;
        sum=0;

        for(int i=0 ; i < 100 ; i++){
            if(Math.abs(Math.pow(2,-i)+Math.pow(3,-i))>=number){
               sum+=Math.pow(2,-i)+Math.pow(3,-i);
            }
        }
        System.out.println("sum = " + sum);
    }

}
