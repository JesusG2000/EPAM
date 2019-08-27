package by.etc.basic_of_software.linear_program;

import java.util.Scanner;

//Найдите значение функции: z = ( (Test – 3 ) * b / 2) + c
public class TaskOne {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Test: ");
        a=scanner.nextDouble();
        System.out.println("Write b: ");
        b=scanner.nextDouble();
        System.out.println("Write c: ");
        c=scanner.nextDouble();

        z=((a-3)*b/2)+c;
        System.out.println(z);
    }
}
