package by.etc.algorithmization.array;

import java.util.Scanner;

public class TaskOne {
    //1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

    public static void main(String[] args) {

        int number;
        int sum;
        int[] mas;

        sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number :");
        number = scanner.nextInt();
        mas=new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % number == 0) {
                sum += mas[i];
            }
        }
        System.out.println("sum = " + sum);

    }
}
