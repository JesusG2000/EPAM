package by.etc.algorithmization.array_in_array;
// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {

        int[][] matrix;
        int number;
        int zeroCount;
        boolean half;
        int n;

        System.out.println("Write matrix size(even)");
        n = new Scanner(System.in).nextInt();
        half = true;
        matrix = new int[n][n];
        number = 1;
        zeroCount = 0;

        if (n % 2 == 0) {

            for (int i = 0; i < matrix.length; i++) {
                for (int y = 0; y < matrix[i].length; y++) {
                    matrix[i][y] = number;
                    for (int z = 0; z < zeroCount; z++) {
                        matrix[i][z] = 0;
                        matrix[i][matrix.length - z - 1] = 0;
                    }
                    System.out.print(matrix[i][y] + " ");
                }
                System.out.println();
                if (half) {
                    zeroCount++;
                }
                if (zeroCount == matrix.length / 2 || !half) {
                    zeroCount--;
                    half = false;
                }
            }
        } else {
            System.out.println("It's not even");
        }
    }
}

