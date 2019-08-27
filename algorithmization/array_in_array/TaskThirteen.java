package by.etc.algorithmization.array_in_array;
// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class TaskThirteen {

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
            int []mas =new int [matrix.length];
            for (int y = 0; y < matrix[i].length; y++) {
                mas[y]=matrix[y][i];
            }
            sortByDecrease(mas);
            for(int z=0; z < matrix.length;z++){
                matrix[z][i]=mas[z];
            }

        }
       show(matrix);
        for (int i = 0; i < matrix.length; i++) {
            int []mas =new int [matrix.length];
            for (int y = 0; y < matrix[i].length; y++) {
                mas[y]=matrix[y][i];
            }
            sortByIncrease(mas);
            for(int z=0; z < matrix.length;z++){
                matrix[z][i]=mas[z];
            }

        }
        show(matrix);

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

    static void show(int [][]mas){
        for (int i = 0; i < mas.length; i++) {
            for (int y = 0; y < mas[i].length; y++) {
                System.out.print(mas[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
