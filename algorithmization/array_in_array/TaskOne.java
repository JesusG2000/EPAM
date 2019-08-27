package by.etc.algorithmization.array_in_array;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class TaskOne {

    public static void main(String[] args) {

        int[][] matrix;

        matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = (int) (Math.random() * 9 + 1);
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int y = 0; y < matrix.length; y++) {
            if (matrix[0][y] > matrix[matrix.length - 1][y]) {
                for (int z = 0; z < matrix.length; z++) {
                    System.out.println(matrix[z][y]);
                }
                System.out.println();
            }
        }

    }
}



