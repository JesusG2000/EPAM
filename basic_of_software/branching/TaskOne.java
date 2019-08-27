package by.etc.basic_of_software.branching;

import java.util.Scanner;

public class TaskOne {
    // Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //он прямоугольным.
    public static void main(String[] args) {

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Test:");
        a = scanner.nextInt();
        System.out.println("Write b:");
        b = scanner.nextInt();
        if (a + b == 90) {
            System.out.println("This triangle is exist and has direct angle");
        } else if (a + b < 180) {
            System.out.println("This triangle is exist and doesn't has direct angle");
        } else {
            System.out.println("This triangle isn't exist");
        }


    }
}
