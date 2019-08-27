package by.etc.basic_of_software.cycle;

import java.util.Scanner;

public class TaskSeven {
    //. Для каждого натурального числа в промежутке от m до n вывести все делители,
    // кроме единицы и самого числа. m и n вводятся с клавиатуры.

    public static void main(String[] args) {
        int from;
        int to;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write from:");
        from = scanner.nextInt();
        System.out.println("Write to:");
        to = scanner.nextInt();

        for (int i = from; i <= to; i++) {
            System.out.println();
            System.out.print(i);
            for (int y = 2; y <= to; y++) {
                if (i != y && i != 1 && i % y == 0) {
                    System.out.print("(" + y + ")");
                }
            }
        }
    }
}
