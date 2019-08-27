package by.etc.algorithmization.array_in_array;
//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class TaskFifteen {

    public static void main(String[] args) {

        int[][] matrix;
        int max;

        matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = (int) (Math.random() * 90 + 10);
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();

        max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if (max < matrix[i][y]) {
                    max = matrix[i][y];
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if((i+y)%2==0){
                    matrix[i][y]=max;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
    }
}

