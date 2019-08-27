package by.etc.basic_of_software.branching;

import java.util.Scanner;

public class TaskTwo {
    // Найти max{min(Test, b), min(c, d)}.

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Test:");
        a=scanner.nextInt();
        System.out.println("Write b:");
        b=scanner.nextInt();
        System.out.println("Write c:");
        c=scanner.nextInt();
        System.out.println("Write d:");
        d=scanner.nextInt();

        System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
    }
}
