package by.etc.algorithmization.array;

// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class TaskFour {

    public static void main(String[] args) {

        int[] mas;
        int max;
        int min;
        int indexOfMax;
        int indexOfMin;
        int replace;


        mas = new int[10];
        indexOfMax = 0;
        indexOfMin = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        max = min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
                indexOfMin = i;
            }
            if (max < mas[i]) {
                max = mas[i];
                indexOfMax = i;
            }
        }
        replace = mas[indexOfMax];
        mas[indexOfMax] = mas[indexOfMin];
        mas[indexOfMin] = replace;

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }
}
