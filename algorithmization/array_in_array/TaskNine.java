package by.etc.algorithmization.array_in_array;
// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.
public class TaskNine {

    public static void main(String[] args) {

        int[][] matrix;
        int[] columnSum;
        int maxSum;
        int index;

        matrix = new int[6][6];
        columnSum=new int[6];

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
              columnSum[i]+=matrix[y][i];
            }
        }

        maxSum=columnSum[0];
        index=0;
        for(int i= 0 ; i < columnSum.length ; i++){
            System.out.println(columnSum[i]+" - "+i);
          if(maxSum<columnSum[i]){
              maxSum=columnSum[i];
              index=i;
          }
        }
        System.out.println("Max sum in " +index +" column");

    }
}
