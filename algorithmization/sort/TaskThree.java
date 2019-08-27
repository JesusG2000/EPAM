package by.etc.algorithmization.sort;


//Сортировка выбором. Дана последовательность чисел  .Требуется переставить элементы так,
// чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого,
// выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего.
// Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
public class TaskThree {

    public static void main(String[] args) {

        int[] mas;
        int max;
        int indexOfMax;
        int counter;

        mas = new int[]{1, 34, 2456, 12, 22, 5, 7, 4, 88, -1, 88};
        indexOfMax = 0;
        counter = 0;


        while (counter != mas.length - 1) {
            max = mas[counter];
            for (int i = counter; i < mas.length; i++) {
                if (max <= mas[i]) {
                    max = mas[i];
                    indexOfMax = i;
                }
            }
            int replace = mas[counter];
            mas[counter] = mas[indexOfMax];
            mas[indexOfMax] = replace;
            counter++;

        }
        for (int a : mas) {
            System.out.print(a + " ");
        }
        System.out.println("\n"+counter);

    }
}
