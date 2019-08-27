package by.etc.algorithmization.array_in_array;

import java.util.Scanner;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class TaskThree {

    public static void main(String[] args) {

        int[][] matrix;
        int column;
        int line;

        matrix = new int[6][6];


        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = (int) (Math.random() * 9 + 1);
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write column");
        column = scanner.nextInt();
        System.out.println("Write line");
        line = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][line]);
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[column][i] + " ");
        }
    }
}
