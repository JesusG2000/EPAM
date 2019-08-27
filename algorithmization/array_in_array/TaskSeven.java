package by.etc.algorithmization.array_in_array;
// Сформировать квадратную матрицу порядка N по правилу:
//и подсчитать количество положительных элементов в ней.

import java.util.Scanner;

public class TaskSeven {

    public static void main(String[] args) {

        double[][] matrix;
        int n;
        int countOfPositive;
        double inDegree;

        countOfPositive=0;
        inDegree=Math.PI/180;
        System.out.println("Write matrix size");
        n = new Scanner(System.in).nextInt();

        matrix = new double[n][n];



            for (int i = 0; i < matrix.length; i++) {
                for (int y = 0; y < matrix[i].length; y++) {
                    matrix[i][y]=Math.sin((i*i*inDegree-y*y*inDegree)/Math.pow(matrix.length,2));
                    if(matrix[i][y]>0){
                        countOfPositive++;
                    }
                    System.out.print(matrix[i][y]+" ");

                }
                System.out.println();
            }
        System.out.println("countOfPositive = " + countOfPositive);

    }
}
