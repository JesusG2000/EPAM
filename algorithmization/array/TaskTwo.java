package by.etc.algorithmization.array;

import java.util.Scanner;

public class TaskTwo {
    // Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
    // большие данного Z, этим числом. Подсчитать количество замен.

    public static void main(String[] args) {

        int count;
        int number;
        int[] mas;

        count = 0;
        mas= new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number :");
        number = scanner.nextInt();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for(int i=0 ; i<mas.length ; i++){
            if(mas[i]>number){
                mas[i]=number;
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
