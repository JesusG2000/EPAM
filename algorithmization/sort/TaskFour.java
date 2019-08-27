package by.etc.algorithmization.sort;
//Сортировка обменами.
// Дана последовательность чисел  .Требуется переставить числа в порядке возрастания.
// Для этого сравниваются два соседних числа  то делается перестановка.
// Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
//
public class TaskFour {

    public static void main(String[] args) {

        int[] mas;
        int counter;
        int sort;

        mas = new int[]{1, 34, 2456, 12, 22, 5, 7, 4, 88, -1, 88};
        counter = 0;
        sort = 1;

        while (sort != 0) {
            sort = 0;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    int replace = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = replace;
                    sort++;
                    counter++;
                }
            }


        }
        for (int a : mas) {
            System.out.print(a + " ");
        }
        System.out.println("\n" + counter);
    }
}
