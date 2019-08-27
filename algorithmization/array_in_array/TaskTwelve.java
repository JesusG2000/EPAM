package by.etc.algorithmization.array_in_array;
//. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class TaskTwelve {

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

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = sortByIncrease(matrix[i]);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = sortByDecrease(matrix[i]);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }


    }

    static int[] sortByIncrease(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int y = 0; y < mas.length; y++) {
                if (mas[i] < mas[y]) {
                    int number = mas[i];
                    mas[i] = mas[y];
                    mas[y] = number;
                }
            }
        }
        return mas;
    }

    static int[] sortByDecrease(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int y = 0; y < mas.length; y++) {
                if (mas[i] > mas[y]) {
                    int number = mas[i];
                    mas[i] = mas[y];
                    mas[y] = number;
                }
            }
        }
        return mas;
    }
}
