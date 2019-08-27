package by.etc.algorithmization.array_in_array;
//. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
public class TaskTwo {

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
            for (int y = 0; y < matrix[i].length; y++) {
                if(i==y){
                    System.out.print(matrix[i][y]+" ");
                }
            }
        }
    }
}
