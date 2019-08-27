package by.etc.algorithmization.array_in_array;
// Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
public class TaskEleven {

    public static void main(String[] args) {

        int[][] matrix;
        int countOfFive;

        matrix = new int[10][15];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = (int) (Math.random() * 16);
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            countOfFive = 0;
            for (int y = 0; y < matrix[i].length; y++) {
                if (matrix[i][y] == 5) {
                    countOfFive++;
                }
            }
            if (countOfFive >= 3) {
                System.out.println(i);

            }

        }
    }
}
