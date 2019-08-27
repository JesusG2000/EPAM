package by.etc.algorithmization.array;


// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class TaskFive {

    public static void main(String[] args) {

        int[] mas;

        mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > i) {
                System.out.print(mas[i] + " ");
            }
        }
    }
}
