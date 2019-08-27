package by.etc.algorithmization.array_in_array;

import java.util.Scanner;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца
// поставить на соответствующие им позиции другого,
// а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
public class TaskEight {

    public static void main(String[] args) {

        int[][] matrix;
        int firstColumn;
        int secondColumn;

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
        System.out.println("Write first column");
        firstColumn=scanner.nextInt();
        System.out.println("Write second column");
        secondColumn=scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
          int number=matrix[i][firstColumn];
          matrix[i][firstColumn]=matrix[i][secondColumn];
          matrix[i][secondColumn]=number;
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
    }
}
