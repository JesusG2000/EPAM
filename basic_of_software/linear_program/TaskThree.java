package by.etc.basic_of_software.linear_program;

import java.util.Scanner;

public class TaskThree {
    // Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    public static void main(String[] args) {

        int x;
        int y;
        double inDegree;
        inDegree = Math.PI / 180;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write x: ");
        x = scanner.nextInt();
        System.out.println("Write y: ");
        y = scanner.nextInt();

        System.out.println(((Math.sin(x * inDegree) + Math.cos(y * inDegree)) /
                (Math.cos(x * inDegree) - Math.sin(y * inDegree))) * Math.tan(x * y * inDegree));

    }
}
