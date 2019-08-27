package by.etc.algorithmization.sort;
//. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
// Делается это следующим образом: сравниваются два соседних элемента.
// Если  , то продвигаются на один элемент вперед. Если  ,
// то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
public class TaskSix {

    public static void main(String[] args) {


        int[] mas;
        int counter=0;

        mas = new int[]{1, 34, 2456, 12, 22, 5, 7, 4, 88, -1, 88};

        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1]) {
                int replace = mas[i];
                mas[i] = mas[i + 1];
                mas[i + 1] = replace;
                i -= 2;
                if (i < -1) {
                    i = 0;
                }
                counter++;
            }
        }
        for (int a : mas) {
            System.out.print(a + " ");
        }
        System.out.println("\n"+counter);
    }
}
