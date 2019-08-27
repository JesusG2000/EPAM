package by.etc.algorithmization.decomposition;

import java.util.Arrays;

// Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
// Для решения задачи использовать декомпозицию
public class TaskFourteen {
    public static void main(String[] args) {


       checkArmstrongsDigitals(2000000);
    }

    static int [] checkArmstrongsDigitals(int limit){
       int []mas= new int [limit];
       int counter=0;
       for(int i = 1 ; i <=limit ; i++ ){
           int size=(i+"").length();
           int sum=0;
           for(int y = 0 ; y <size;y++ ){
               sum+=(Math.pow((int)(i/Math.pow(10,y)%10),size));

           }
           if(sum==i){
               mas[counter]=i;
               System.out.println(i);
               counter++;
           }
       }
        return mas;
    }
}
