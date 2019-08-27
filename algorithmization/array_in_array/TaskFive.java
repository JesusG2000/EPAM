package by.etc.algorithmization.array_in_array;
//. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        int[][] matrix;
        int number;
        int zeroCount;
        int n;

        System.out.println("Write matrix size(even)");
        n = new Scanner(System.in).nextInt();
        matrix = new int[n][n];
        number = 1;
        zeroCount = 0;

        if (n % 2 == 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int y = 0; y < matrix[i].length; y++) {
                    matrix[i][y] = number;
                    for (int z = 0; z < zeroCount; z++) {
                        matrix[i][matrix[i].length - z - 1] = 0;
                    }
                    System.out.print(matrix[i][y] + " ");
                }
                System.out.println();
                number++;
                zeroCount++;
            }
            System.out.println();
        } else {
            System.out.println("It's not even");
        }
    }
}
