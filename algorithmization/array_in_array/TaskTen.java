package by.etc.algorithmization.array_in_array;
// Найти положительные элементы главной диагонали квадратной матрицы
public class TaskTen {

    public static void main(String[] args) {

        int[][] matrix;

        matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = (int) (Math.random() * 10 -2);
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if (matrix[i][y] > 0 && i==y) {
                    System.out.println(matrix[i][y]);
                }
            }

        }

    }
}
