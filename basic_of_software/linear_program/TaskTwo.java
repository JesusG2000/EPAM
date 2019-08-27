package by.etc.basic_of_software.linear_program;

import java.util.Scanner;

public class TaskTwo {
    // Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Test: ");
        a=scanner.nextInt();
        System.out.println("Write b: ");
        b=scanner.nextInt();
        System.out.println("Write c: ");
        c=scanner.nextInt();

        System.out.println(b+Math.sqrt(b*b+4*a*c)/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2));

    }
}
