package by.etc.algorithmization.array_in_array;
// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
public class TaskFourteen {

    public static void main(String[] args) {

        int[][] matrix;
        boolean finish;
        int countOfOne;
        int m;
        int n;

        m=0;
        n=0;
        finish = false;
        while (!finish) {
            m = (int) (Math.random() * 6 + 1);
            n = (int) (Math.random() * 6 + 1);
            if(m==n){
                finish=true;
            }
        }
        finish = false;

        matrix = new int[m][n];


        while (!finish) {
            finish = true;


            for (int i = 0; i < matrix.length; i++) {
                for (int y = 0; y < matrix[i].length; y++) {
                    matrix[i][y] = (int) (Math.random() * 2);
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                countOfOne = 0;
                for (int y = 0; y < matrix[i].length; y++) {
                    if (matrix[y][i] == 1) {
                        countOfOne++;
                    }
                }
                if (countOfOne != i) {
                    finish = false;
                }
            }
        }
        show(matrix);
    }

    static void show(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int y = 0; y < mas[i].length; y++) {
                System.out.print(mas[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

