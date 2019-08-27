package by.etc.basic_of_software.cycle;

import java.util.Scanner;

public class TaskOne {
    // Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.
    public static void main(String[] args) {

        int sum;
        int digital;

        sum=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write digital");
        digital=scanner.nextInt();
        for(int i =1 ; i <= digital; i++){
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }
}
