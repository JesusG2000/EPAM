package by.etc.algorithmization.array_in_array;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class TaskFour {

    public static void main(String[] args) {

        int[][] matrix;
        int number;
        boolean even;
        int n;

        System.out.println("Write matrix size(even)");
        n = new Scanner(System.in).nextInt();
        matrix = new int[n][n];

        if (n % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                if (i % 2 == 0) {
                    number = 1;
                    even = true;
                } else {
                    number = matrix.length;
                    even = false;
                }
                for (int y = 0; y < matrix[i].length; y++) {
                    matrix[i][y] = number;
                    if (even) {
                        number++;
                    } else {
                        number--;
                    }

                    System.out.print(matrix[i][y] + " ");
                }
                System.out.println();
            }
            System.out.println();


        }else{
            System.out.println("It's not even");
        }
    }
}